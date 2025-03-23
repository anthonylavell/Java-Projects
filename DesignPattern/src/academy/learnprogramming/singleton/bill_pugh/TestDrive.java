package academy.learnprogramming.singleton.bill_pugh;

public class TestDrive {
    public static void main(String[] args) {
        Driver carDriver = Driver.getInstance();
        Driver truckDriver = Driver.getInstance();

        if(carDriver == truckDriver){
            System.out.println("carDriver and truckDriver are the same instantiate");
        }

        carDriver.setName("Anthony");
        System.out.println(truckDriver.getCaptainName());
    }
}
