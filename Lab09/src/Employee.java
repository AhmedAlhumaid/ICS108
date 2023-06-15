public class Employee extends Person {
    private String id;
    private double monthSalary;

    public Employee(String name,String phoneNumber,String id, double monthSalary){
        super(name,phoneNumber);
        this.id = id;
        this.monthSalary = monthSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " +  this.id + ", Salary: " + this.monthSalary;
    }

    public double getMonthSalary() {
        return this.monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }
}

