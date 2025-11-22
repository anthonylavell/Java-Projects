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
        accountsMerge(accounts);


    }
}
