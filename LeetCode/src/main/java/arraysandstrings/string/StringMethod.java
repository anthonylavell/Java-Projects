package arraysandstrings.string;

public class StringMethod {
    private static String fName = "Anthony";
    public static void main(String[] args) {
       // System.out.println(isNamesEqual("anthonY"));
        //System.out.println(replaceCharacter());
        //System.out.println(replaceFirstCharacter());
        //System.out.println(fName);
        String val = "a";
        String val2 = "b";
        System.out.println(isNamesEqual(val, val2));
        val = "Ant";
        val2 = "Bnt";
        System.out.println(isNamesEqual(val, val2));
        val ="Ant";
        val2 ="ant";
        System.out.println(isNamesEqual(val, val2));

    }

    public static boolean isNamesEqual(String name, String name2){
       return name.equals(name2);
    }

    public static boolean isNamesEqualWithAnyCase(String name, String name2){
        return name.equalsIgnoreCase(name);
    }
    public static String replaceCharacter(String val){
        // change letter a to letter b
        //String tempStr = val.toLowerCase();
        //tempStr = tempStr.replace('n','a');
        return fName.replace('n','a').toLowerCase();
    }

    public static String replaceFirstCharacter(){
        // change first letter to c
        //String tempStr = fName.toLowerCase();
        //tempStr = tempStr.replaceFirst("n","a");
        return fName.replaceFirst("n","a").toLowerCase();
    }

}
