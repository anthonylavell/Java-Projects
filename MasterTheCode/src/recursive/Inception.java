package recursive;

public class Inception {
    public static void main(String[] args) {
        inception(0);
    }
    public static String inception(int counter){
        if(counter > 3){
            return "done!";
        }
        counter++;
        System.out.println(inception(counter));
        return "";
    }
}
