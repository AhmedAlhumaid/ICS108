public class Graduate extends Student{
    Graduate(String id,double gpa){
        super(id,gpa);
    }
    public String getId(){
        return this.id;
    }

    @Override
    public String getStatus() {
        if(this.gpa>=3){return "good";}
        else{return "probation";}
    }

    @Override
    public double getGpa() {
        return this.gpa;
    }
}
