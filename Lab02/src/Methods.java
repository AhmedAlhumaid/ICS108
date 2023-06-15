import java.util.Scanner;
public class Methods {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many grades");
        int n = input.nextInt();
        printNRandomLetterGrades(n);
    }
    public static void printNRandomLetterGrades(int n){
        for(int i = 0;i <n;i++){
            int random =1+(int) (Math.random()*10);
            if(random == 1){
                System.out.println("A+");
            }
            else if (random == 2){
                System.out.println("A");
            }
            else if (random == 3){
                System.out.println("B+");
            }
            else if (random == 4){
                System.out.println("B");
            }
            else if (random == 5){
                System.out.println("C+");
            }
            else if (random == 6){
                System.out.println("C");
            }
            else if (random == 7){
                System.out.println("D+");
            }
            else if (random == 8){
                System.out.println("D");
            }
            else if (random == 9){
                System.out.println("F");
            }

        }


    }
}
