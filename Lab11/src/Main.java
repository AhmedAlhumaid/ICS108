import java.util.*;
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        Student[] arr = new Student[3];
        arr[0] = new Graduate("0000","Ahmed","0505891400",3.5,"CS");
        arr[1] = new Undergraduate("0001","Fahad","0505141825",3.6,"FR");
        arr[2] = new Graduate("0002","Aziz","0505891",3.7,"SWE");
        System.out.println(arr[2]);
        for(Student object : arr){
            if(object instanceof Graduate){
                sum = sum + ((Graduate)object).getGpa();
                count++;
                System.out.println(object);
            }

        }
        System.out.println("Their average gpa = " + (sum/count));
        sum = 0;
        count = 0;
        for(Student object : arr){
            if(object instanceof Undergraduate){
                sum = sum + ((Undergraduate)object).getGpa();
                count++;
                System.out.println(object);
            }
        }
        System.out.println("Their average gpa = " + (sum/count));
    }
}