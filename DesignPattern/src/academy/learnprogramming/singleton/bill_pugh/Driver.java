package academy.learnprogramming.singleton.bill_pugh;

public class Driver {
    private String captainName;
    private Driver(){}

    private static class SingletonHelper{
        private static final Driver uniqueStance = new Driver();
    }

    public static Driver getInstance(){
        return SingletonHelper.uniqueStance;
    }

    public void setName(String name){
        captainName = name;
    }

    public String getCaptainName(){
        return captainName;
    }
}
