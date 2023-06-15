public class Graduate extends Student {
    String researchArea;
    public Graduate(String id,String name,String phoneNumber,double gpa,String researchArea){
        super(id,name,phoneNumber,gpa);
        this.researchArea = researchArea;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " " + researchArea ;
    }
}
