import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeMap<String ,TreeSet<Integer>> majorsMap = new TreeMap<>();
        try{
            File file = new File("info.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                int id = input.nextInt();
                String major = input.next();

                if(!majorsMap.containsKey(major)){ //if the major is not in the map as a key, then put it and make its value a set.
                    majorsMap.put(major,new TreeSet<>());
                }
                majorsMap.get(major).add(id); //add the id in the set
            }

            System.out.println(majorsMap);
            input.close();

        }

        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}