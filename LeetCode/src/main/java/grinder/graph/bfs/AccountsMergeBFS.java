package grinder.graph.bfs;

import java.util.*;

public class AccountsMergeBFS {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String,String> emailToName = new HashMap<>();
        Map<String,List<String>> graphs = new HashMap<>();
        List<List<String>> mergeAccounts = new ArrayList<>();
        for (List<String> account : accounts){
            String name = account.get(0);
            String firstEmail = account.get(1);
            emailToName.putIfAbsent(firstEmail,name);
            graphs.putIfAbsent(firstEmail,new ArrayList<>());
            for (int index = 2; index < account.size(); index++){
                String currentEmail = account.get(index);
                emailToName.putIfAbsent(currentEmail,name);
                graphs.putIfAbsent(currentEmail,new ArrayList<>());
                graphs.get(firstEmail).add(currentEmail);
                graphs.get(currentEmail).add(firstEmail);
            }
        }
        Set<String>visited = new HashSet<>();
        Deque<String>deque = new ArrayDeque<>();
        for (String key : graphs.keySet()){
            List<String>list = new ArrayList<>();
            if (visited.add(key)){
                list.add(key);
                deque.add(key);
                while (!deque.isEmpty()) {
                    List<String>emails = graphs.get(deque.poll());
                    for (String email : emails) {
                        if (!visited.contains(email)){
                            list.add(email);
                            deque.add(email);
                            visited.add(email);
                        }
                    }
                }
                Collections.sort(list);
                list.add(0,emailToName.get(key));
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
