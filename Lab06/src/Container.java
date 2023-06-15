import java.util.*;
public class Container {
    private ArrayList<Integer> weights = new ArrayList<>();
    private int maxWeight;

    Container(int max){
        maxWeight = max;
    }
    boolean addItem(int weight){
        int sum = 0;
        for(int i = 0; i<weights.size();i++){
            sum = sum + weights.get(i);
        }
        if((sum + weight)>maxWeight){
            return false;
        }
        else{
            weights.add(weight);
            return true;
        }



    }
    ArrayList<Integer> getWeights(){
        return weights;
    }
}
