package comp_p.okta;

import java.util.*;

public class MakingFileNamesUnique {
    public static void main(String[] args) {
        String[] names = {"kaido","kaido(1)","kaido","kaido(1)","kaido(2)"};
        String[] newNames = getFolderNames(names);
        System.out.println(Arrays.toString(newNames));
    }
    public static String[] getFolderNames(String[] names) {
        Map<String,Integer> mapOfNames = new LinkedHashMap<>();
        String[] ans = new String[names.length];
        for (int index = 0; index < names.length; index++){
            String name = names[index];
            if (!mapOfNames.containsKey(name)){
                mapOfNames.put(name,1);
                ans[index] = name;
            }else {
                int num = mapOfNames.get(name);
                String newName = name + "(" + num + ")";
                while (mapOfNames.containsKey(newName)) {
                    num++;
                    newName = name + "(" + num + ")";
                }
                mapOfNames.put(name, num + 1);
                mapOfNames.put(newName,1);
                ans[index] = newName;
            }
        }
        return ans;
    }
}
