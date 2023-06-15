public class Student extends Person {
    private String id;
    private double gpa;

    public Student(String name,String phoneNumber,String id, double gpa){
        super(name,phoneNumber);
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ",ID: " +  this.id + ", GPA: " + this.gpa;
    }

  public double getGpa(){
        return this.gpa;
  }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
