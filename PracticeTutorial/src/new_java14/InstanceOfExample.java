package new_java14;

public class InstanceOfExample {
    public static void main(String[] args) {
        Object obj = "Anthony";
        //Before jdk14 feature
        if (obj instanceof String) {
            String str = (String) obj;
            int len = str.length();
            System.out.println("----Before jdk14 feature----");
            System.out.println("len = " + len);
        }

        if (obj instanceof String str) {
            int len = str.length();
            System.out.println("---- jdk14 feature----");
            System.out.println("len = " + len);
        }
    }
}
