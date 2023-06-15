import java.util.*;
public class Test {
    ArrayList<String> arr = new ArrayList<>();

    public ArrayList<String> getArr() {
        return arr;
    }

    public static void main(String[] args) {
        Test x = new Test();
        x.getArr().add("Ahmed");
        System.out.println(x.getArr());
    }

}
