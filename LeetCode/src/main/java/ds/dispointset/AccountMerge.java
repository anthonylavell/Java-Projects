package ds.dispointset;

import java.util.*;

public class AccountMerge {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("John","johnsmith@mail.com","john_newyork@mail.com"));
        List<String> l2 = new ArrayList<>(Arrays.asList("John","johnsmith@mail.com","john00@mail.com"));
        List<String> l3 = new ArrayList<>(Arrays.asList("Mary","mary@mail.com"));
        List<String> l4 = new ArrayList<>(Arrays.asList("John","johnnybravo@mail.com"));
        List<List<String>>accounts = new ArrayList<>();
        accounts.add(l1);
        accounts.add(l2);
        accounts.add(l3);
        accounts.add(l4);
        accountsMerge(accounts);

    }
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        UnionFind uF = new UnionFind(accounts.size());
        Map<String,Integer>emailToID = new HashMap<>();
        for(int row = 0; row < accounts.size(); row++){
            List<String>details = accounts.get(row);
            for(int col = 1; col < details.size(); col++){
                String email = details.get(col);
                if(emailToID.containsKey(email)){
                    uF.union(row,emailToID.get(email));
                }else {
                    emailToID.put(email,row);
                }
            }
        }
        Map<Integer,List<String>>iDToEmail = new HashMap<>();
        for(String key : emailToID.keySet()){
            int root = uF.find(emailToID.get(key));
            if(!iDToEmail.containsKey(root)){
                iDToEmail.put(root, new ArrayList<>());
            }
            iDToEmail.get(root).add(key);
        }
        List<List<String>> mergeDetails = new ArrayList<>(iDToEmail.size());
        for(Integer key: iDToEmail.keySet()){
            List<String>emails = iDToEmail.get(key);
            Collections.sort(emails);
            emails.add(0,accounts.get(key).get(0));
            mergeDetails.add(emails);
        }
       return mergeDetails;
    }
}
