package academy.learnprogramming.singleton.bill_pugh;

public class MakeCaptainSingleton {
    public String captainName;
    private MakeCaptainSingleton(){}

    private static class SingetonHelper{
        private static final MakeCaptainSingleton uniqueStance = new MakeCaptainSingleton();

    }

    public static MakeCaptainSingleton getInstance(){
        return SingetonHelper.uniqueStance;
    }

    public void setName(String name){
        captainName = name;
    }

    public String getCaptainName(){
        return captainName;
    }

}
