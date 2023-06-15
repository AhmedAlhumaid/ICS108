public class Undergraduate extends Student {
    String level;

    public Undergraduate(String id,String name,String phoneNumber,double gpa,String level){
        super(id,name,phoneNumber,gpa);
        this.level = level;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + level;
    }
}
