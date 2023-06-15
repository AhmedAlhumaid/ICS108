import java.util.*;
public class Main {
    public static void main(String[] args) {
        DynamicArray<String> arr = new DynamicArray<>();
        arr.add("Ahmed");
        arr.add("Khaled");
        arr.add("Ahmed");
        arr.add("Alhumaid");
        arr.add("20 years old");
        arr.printArray();
        System.out.println(arr.remove());
    }
}