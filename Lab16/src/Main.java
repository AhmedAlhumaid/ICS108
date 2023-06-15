import java.io.File;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)  {
        ArrayList<Integer> list = new ArrayList<>();

        try{
            File infile = new File("unsortedStudents.txt"); //creating a file object
            Scanner input = new Scanner(infile); // creating a scanner object
            while(input.hasNext()){ //(while the file has tokens)
                list.add(input.nextInt()); // add these tokens to the list
            }
            input.close();
        }
        catch (FileNotFoundException e){ // in case the file does not exist
            System.out.println("file not in directory");
        }
        Collections.sort(list);  // to sort the list in ascending order
        try{
            File outfile = new File("sortedStudents.txt");      // creating the output file object
            PrintWriter output = new PrintWriter("sortedStudents.txt");  // creating a print writer object
            for(Integer id : list){             // for every id in the list
                output.println(id);         // print the id in the desired file
            }
            output.close(); // close the file to save
        }
        catch (FileNotFoundException e){
            System.out.println("file not found in directory");
        }
    }
}