public abstract class Student {
    String id;
    double gpa;
    Student(String id,double gpa){
        this.id = id;
        this.gpa = gpa;
    }
    public abstract String getStatus();
    public abstract double getGpa();
    public abstract String getId();

    @Override
    public final String toString() {
        return "ID: "  + id + "  " + " GPA : " + gpa + " Status: " + getStatus();
    }
}
