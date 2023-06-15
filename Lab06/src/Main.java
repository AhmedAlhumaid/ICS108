import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int weights;
        Scanner input = new Scanner(System.in);
        System.out.println("enter max weight");
        int max = input.nextInt();

        System.out.println("enter number of items");
        int num = input.nextInt();

        System.out.println("enter the weights");
        Container cont  = new Container(max);
        for(int i = 0;i<num;i++){
            weights = input.nextInt();
            if(!cont.addItem(weights)){
                System.out.println(weights+" "+ "item not added because it is too heavy");
            }
        }
        System.out.println(cont.getWeights());
    }
}