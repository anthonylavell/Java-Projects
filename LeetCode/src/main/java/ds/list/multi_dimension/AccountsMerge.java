package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountsMerge {
    public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> mergeAccounts = new ArrayList<>();
        for(List<String>list :accounts){
            Collections.sort(list);
        }
        System.out.println(accounts);
        sortMultiList(accounts);
        System.out.println(accounts);
        System.out.println(accounts.get(0).contains(accounts.get(1)));
        return mergeAccounts;
    }

    public static void sortMultiList(List<List<String>> accounts){
        Collections.sort(accounts, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
    }
}
