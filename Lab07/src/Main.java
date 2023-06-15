import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of objects");
        int numObjects = input.nextInt();
        System.out.println("enter the max weight");
        int maxWeight = input.nextInt();
        System.out.println("enter the weights of the objects");
        ArrayList<Container> contList = new ArrayList<>();
        boolean added = false;
        for(int i = 0; i<numObjects;i++){
            int weight = input.nextInt();
            for(Container cont :contList){
                if(cont.addItem(weight)){
                    added = true;
                    break;
                }
            }
            if(!added){
                contList.add(new Container(maxWeight));
                contList.get(contList.size()-1).addItem(weight);//accessing the last index of the arraylist and add the item(arraylist of objects)
            }
            added = false;
        }
        System.out.println(contList);
    }
}