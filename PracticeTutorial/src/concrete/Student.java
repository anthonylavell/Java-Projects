package concrete;

import abstractclass.IStudent;

import java.util.List;

public class Student implements IStudent {
    private String name;
    private int age;
    private String major;
    private double gpa;
    private String status;
    private boolean onlineClass;
    private List<String>listOfClasses;

    public Student(){

    }

    public Student(String name, int age, String major, double gpa, String status,
                   boolean onlineClass, List<String>listOfClasses) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.status = status;
        this.onlineClass = onlineClass;
        this.listOfClasses = listOfClasses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", status='" + status + '\'' +
                ", OnlineClass=" + onlineClass +
                ", status='" + listOfClasses + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getMajor() {
        return major;
    }

    @Override
    public double getGPA() {
        return gpa;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public boolean onlineClass() {
        return onlineClass;
    }

    @Override
    public List<String>getCourses() {
        return listOfClasses;
    }

    protected String getGuardian(){
        return "Mom";
    }
}
