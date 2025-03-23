package abstractclass;

import java.util.List;

public interface IStudent {
    public String getName();
    public int getAge();
    public String getMajor();
    public double getGPA();
    public String getStatus();
    public boolean onlineClass();
    public List<String> getCourses();
    //public List<List<String>> getListOfProfessor();
}
