public class Student {
    String id;
    String name;
    String phoneNumber;
    double gpa;
    public Student(String id,String name,String phoneNumber,double gpa){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNumber + " " + gpa;
    }
}
