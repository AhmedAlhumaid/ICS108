import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(1);

        remove(arr,1);
        System.out.println(arr);


    }
    public static void remove(ArrayList<Integer> arr,Integer target){
        if(arr.contains(target)){
            arr.remove(target);
           System.out.println("target removed");
        }
       else{
           System.out.println("target was not found");
           return;}
       remove(arr,target);
    }
}