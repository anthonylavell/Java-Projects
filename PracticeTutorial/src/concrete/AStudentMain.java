package concrete;

public class AStudentMain extends Student {
    public static void main(String[] args) {
        AStudentMain student = new AStudentMain();
        System.out.println("Guardian: " +student.getGuardian());
    }


    @Override
    public String getGuardian(){
        return "Dad";
    }
}
