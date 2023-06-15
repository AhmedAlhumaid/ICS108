import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       ArrayList<Integer> arr = new ArrayList<>();
       System.out.println("Enter how many values ");
       int size = input.nextInt();
       System.out.print("Enter the numbers");
        for(int i = 0; i<size;i++){
            arr.add(input.nextInt());
        }
        System.out.println(largestNum(arr));


    }
    public static int largestNum(ArrayList<Integer> arr){
      return largestNum(arr,0);
    }
    public static int largestNum(ArrayList<Integer> arr,int indx){
        if(indx == arr.size()){
            return 0;
        }
        int max = arr.get(indx);
        int maybeMax = largestNum(arr,indx+1);
            if (maybeMax>max){
                max = maybeMax;
            }
        return max;
    }
}