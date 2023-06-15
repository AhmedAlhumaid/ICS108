public class Question {
    private String text;
     public Question(String text){
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return this.text;
    }
}
