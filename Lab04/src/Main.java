import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> weights = new ArrayList<Integer>();
        int counter = 1;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of objects: ");
        int objects = input.nextInt();
        System.out.println("enter the weights");
        ArrayList<Integer> secondArray = new ArrayList<>();
        for(int i = 0;i<objects;i++){
            int weight = input.nextInt();
            weights.add(weight);
        }
        while(weights.size()!=0){
            for(int i = 0;i< weights.size();i++){
                if(10-sum>=weights.get(i)){
                    secondArray.add(weights.get(i));
                    sum = sum+ weights.get(i);
                }}
                System.out.println("container "+counter+" contains"+" " +secondArray);

            for(int j = 0;j< secondArray.size();j++){
                weights.remove(secondArray.get(j));}
                secondArray.clear();
                sum = 0;
                counter++;

        }

    }

}