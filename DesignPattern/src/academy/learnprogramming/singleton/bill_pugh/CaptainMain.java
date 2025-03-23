package academy.learnprogramming.singleton.bill_pugh;

public class CaptainMain {
    public static void main(String[] args) {
        MakeCaptainSingleton captain = MakeCaptainSingleton.getInstance();
        captain.setName("Anthony");
        System.out.println("The captain is: "+captain.getCaptainName());

        MakeCaptainSingleton newCapt = MakeCaptainSingleton.getInstance();
        newCapt.setName("Alvin");
        System.out.println("The captain is: "+newCapt.getCaptainName());

        captain = MakeCaptainSingleton.getInstance();
        captain.setName("Lora");
        System.out.println("The captain is: "+captain.getCaptainName());

        if(captain == newCapt){
            System.out.println("Captain and newCapt are the same instance");
        }
    }
}
