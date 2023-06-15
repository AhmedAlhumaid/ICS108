import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> choices = new ArrayList<>();
        choices.add("MazdaCX30");
        choices.add("Jaguar F-Type");
        MCQuestion question = new MCQuestion("What's the best car",choices,
                "MazdaCX30");


    }
}