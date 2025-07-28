package grinder;

import ds.disjoint.UnionFind;

import java.util.*;

public class AccountsMerge {
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
        Set<String>set = new TreeSet<>(accounts.get(1));
        System.out.println(accounts.get(0).indexOf("johnsmith@mail.com"));
        System.out.println(set);
        set.addAll(accounts.get(0));
        System.out.println(set);
        accountsMerge(accounts2);
    }


    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        UnionFind uF = new UnionFind(accounts.size());
        Map<String, Integer> emailToID = new HashMap<>();
        for (int row = 0; row < accounts.size(); row++) {
            List<String> details = accounts.get(row);
            for (int col = 1; col < details.size(); col++) {
                String email = details.get(col);
                if (emailToID.containsKey(email)) {
                    uF.union(row, emailToID.get(email));
                } else {
                    emailToID.put(email, row);
                }
            }
        }
        Map<Integer, List<String>> iDToEmail = new HashMap<>();
        for (String key : emailToID.keySet()) {
            int root = uF.find(emailToID.get(key));
            if (!iDToEmail.containsKey(root)) {
                iDToEmail.put(root, new ArrayList<>());
            }
            iDToEmail.get(root).add(key);
        }
        List<List<String>> mergeDetails = new ArrayList<>(iDToEmail.size());
        for (Integer key : iDToEmail.keySet()) {
            List<String> emails = iDToEmail.get(key);
            Collections.sort(emails);
            emails.add(0, accounts.get(key).get(0));
            mergeDetails.add(emails);
        }
        return mergeDetails;
    }
}
