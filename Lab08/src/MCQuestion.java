import java.util.*;
public class MCQuestion extends Question {
    private ArrayList <String> choices = new ArrayList<>();
    private String answer;
   public MCQuestion(String text,ArrayList<String> choices,String answer){
        super(text);
       this.choices = choices;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+this.choices+"\n" + "Answer:" + this.answer;
    }
}
