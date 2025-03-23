package new_java14;

import java.util.function.Function;

public class SwitchExample {
    public static void main(String[] args) {
        Function<String,String> func = SwitchExample::adultORchild;
        System.out.println(func.apply("Anthony"));

    }
    public static String adultORchild(String name){
        String status = switch (name) {
            case "Lil charles","Lil Anthony","Lil James" -> "child";
            case "Charles","James","Anthony" -> "adult";
            default -> throw new IllegalArgumentException("Who is that");
        };
        return status;
    }
}
