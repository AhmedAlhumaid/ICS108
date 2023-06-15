public class Undergraduate extends Student {

    Undergraduate(String id,double gpa){
        super(id,gpa);
    }
    public double getGpa(){
        return this.gpa;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String getStatus() {
        if(this.gpa>=3){
            return "honor";
        }
        else if(this.gpa>=2){return "good";}

        else{return "probation";}
    }

}
