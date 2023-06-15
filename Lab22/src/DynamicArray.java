import java.util.Arrays;
import java.util.*;
public class DynamicArray <T>{
    private int size = 2;
    private Object[] arr = new Object[size];
    private int count = 1;

    public void add(T item){
        if(count <= this.arr.length){
            this.arr[count-1] = item;
            count++;
        }
        else{
            size = size*2;
            Object[] Copy = this.arr;
            this.arr = new Object[size];
            for(int i = 0; i < Copy.length ; i++){
                this.arr[i] = Copy[i];
            }
            this.arr[count-1] = item; // add the new element in the index after the last full index
            count++;
        }
    }
    public T remove(){
        List<Object> Copy = new ArrayList<>();
        for (int i =0; i<this.arr.length;i++){
            Copy.add(this.arr[i]);
        }
       Object removed = Copy.remove(count-2);
        for (int i = 0; i<Copy.size();i++){
            this.arr[i] = Copy.get(i);
        }
        return (T) removed;
    }
    public void printArray(){
        for(int i =0 ; i<this.arr.length;i++){
            System.out.println(this.arr[i]);
        }
    }
}
