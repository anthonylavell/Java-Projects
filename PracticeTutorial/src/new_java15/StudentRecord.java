package new_java15;

public record StudentRecord(String name, int age) {
    public StudentRecord{
        if (age < 1){
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
