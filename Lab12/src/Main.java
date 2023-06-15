import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student[] arr = new Student[4];
        arr[0] = new Graduate("0000",3);
        arr[1] = new Graduate("0001",2.5);
        arr[2] = new Undergraduate("0002",3.5);
        arr[3] = new Undergraduate("0003",1.75);
        for(int i = 0;i<arr.length;i++){
         if(arr[i] instanceof Graduate){
             System.out.print("Graduate  ");
             System.out.println(arr[i]);
         }
         else{
             System.out.print("Undergraduate  ");
             System.out.println(arr[i]);
         }
        }
        Student s1 = new Undergraduate("222",3.4);
        System.out.println(s1.getGpa());

    }
    public static void printing(Student obj){
        System.out.println("hi");
    }
}