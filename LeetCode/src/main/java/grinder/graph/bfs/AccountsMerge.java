package grinder.graph.bfs;

import java.util.*;

public class AccountsMerge {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String,List<String>>graph = new HashMap<>();
        Map<String,String>emailToNames = new HashMap<>();
        List<List<String>>mergeAccounts = new ArrayList<>();
        for (List<String>account : accounts) {
            String firstEmail = account.get(1);
            String name = account.get(0);
            graph.putIfAbsent(firstEmail, new ArrayList<>());
            emailToNames.put(firstEmail, name);
            for (int index = 2; index < account.size(); index++) {
                String currentEmail = account.get(index);
                emailToNames.put(currentEmail, name);
                graph.get(firstEmail).add(currentEmail);
                graph.computeIfAbsent(currentEmail, k -> new ArrayList<>()).add(firstEmail);
            }
        }
        Deque<String>deque =new ArrayDeque<>();
        Set<String>visited = new HashSet<>();
        for (Map.Entry<String,List<String>>entry:graph.entrySet()){
            if(visited.add(entry.getKey())) {
                deque.add(entry.getKey());
                List<String>list = new ArrayList<>();
                list.add(entry.getKey());
                while (!deque.isEmpty()) {
                    String key = deque.poll();
                    List<String> emails = graph.get(key);
                    for (String email : emails) {
                        if (visited.add(email)) {
                            list.add(email);
                            deque.add(email);
                        }
                    }
                }
                Collections.sort(list);
                list.add(0,emailToNames.get(entry.getKey()));
                mergeAccounts.add(list);
            }
        }
        return mergeAccounts;
    }

    public static void main(String[] args) {
        List<List<String>> accounts = List.of(
                Arrays.asList("John","johnsmith@mail.com","john_newyork@mail.com"),
                Arrays.asList("John","johnsmith@mail.com","john00@mail.com"),
                Arrays.asList("Mary","mary@mail.com"),
                Arrays.asList("John","johnnybravo@mail.com")
        );

        List<List<String>> accounts2 = List.of(
                Arrays.asList("David","David0@m.co","David1@m.co"),
                Arrays.asList("David","David3@m.co","David4@m.co"),
                Arrays.asList("David","David4@m.co","David5@m.co"),
                Arrays.asList("David","David2@m.co","David3@m.co"),
                Arrays.asList("David","David1@m.co","David2@m.co")
        );

        List<List<String>> accounts3 = List.of(
                Arrays.asList("Isa","Isa6@m.co","Isa0@m.co","Isa1@m.co","Isa6@m.co","Isa1@m.co"),
                Arrays.asList("David","David10@m.co","David12@m.co","David7@m.co","David6@m.co","David1@m.co"),
                Arrays.asList("Alex","Alex1@m.co","Alex7@m.co","Alex6@m.co","Alex11@m.co","Alex2@m.co"),
                Arrays.asList("Hanzo","Hanzo11@m.co","Hanzo2@m.co","Hanzo5@m.co","Hanzo5@m.co","Hanzo3@m.co"),
                Arrays.asList("Bob","Bob12@m.co","Bob1@m.co","Bob12@m.co","Bob7@m.co","Bob5@m.co"),
                Arrays.asList("Isa","Isa4@m.co","Isa1@m.co","Isa3@m.co","Isa9@m.co","Isa2@m.co"),
                Arrays.asList("Kevin","Kevin0@m.co","Kevin7@m.co","Kevin12@m.co","Kevin3@m.co","Kevin5@m.co"),
                Arrays.asList("David","David12@m.co","David6@m.co","David10@m.co","David0@m.co","David8@m.co"),
                Arrays.asList("Celine","Celine0@m.co","Celine8@m.co","Celine10@m.co","Celine2@m.co","Celine12@m.co"),
                Arrays.asList("Kevin","Kevin1@m.co","Kevin8@m.co","Kevin5@m.co","Kevin9@m.co","Kevin0@m.co"),
                Arrays.asList("Alex","Alex3@m.co","Alex8@m.co","Alex1@m.co","Alex12@m.co","Alex12@m.co"),
                Arrays.asList("Kevin","Kevin8@m.co","Kevin12@m.co","Kevin1@m.co","Kevin10@m.co","Kevin9@m.co")
        );
        accountsMerge(accounts);


    }
}
