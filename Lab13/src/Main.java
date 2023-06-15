import java.util.*;
public class Main {
    public static void main(String[] args) {
        City c1 = new City("Khobar",29);
        City c2 = c1.clone();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = (ArrayList<String>)list1.clone();
    City[] cityArr = new City[5];
    cityArr[0] = new City("Khobar",29);
    cityArr[1] = new City("London",4);
    cityArr[2] = cityArr[1].clone();
    cityArr[3] = new City("Dubai",26);
        System.out.println(Arrays.toString(cityArr));
        System.out.println(cityArr[2].equals(cityArr[1]));
        System.out.println(cityArr[1].compareTo(cityArr[0]));
    }
}