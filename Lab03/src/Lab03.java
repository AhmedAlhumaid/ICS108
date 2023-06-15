import java.util.Scanner;
import java.util.Arrays;
public class Lab03 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        input.nextLine();
        int[] intArr = new int[size];
        System.out.println("enter the content of the array");
        String content = input.nextLine();
        String [] array = content.split(" ");
        for(int i = 0; i< size;i++){
            intArr[i] = Integer.parseInt(array[i]);
        }
        boolean result = isValid(intArr);
        if(result){
            System.out.println("valid");
        }
        else{
            System.out.println("not a valid array");
        }


    }
    public static boolean isValid(int[] Array){
         int size = Array.length;
         int [] secondArray = new int[size];
         int j = 0;
         Arrays.sort(Array);

         for(int i = 1; i <=size;i++){
             secondArray[j] = i;
             j++;
         }
        return Arrays.equals(Array, secondArray);






    }
}
