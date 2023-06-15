import java.util.Scanner;
public class Lab01 {
    public static void main(String[] args){
        int courses_num;
        int credit;
        int total_credit = 0;
        double grade=0;
        double sum = 0.0;
        double total_sum = 0;
        double GPA;
        String letter;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of courses");
        courses_num = input.nextInt();

        for(int i = 0; i < courses_num; i++){

            System.out.println("enter the letter grade for this course");
            letter = input.next();
            System.out.println("enter the credit hours in this course");
            credit = input.nextInt();
            total_credit = total_credit + credit;
            if (letter.equals("A+")){
                grade = 4.0;
            }
            else if (letter.equals("A")){
                grade = 3.75;
            }
            else if(letter.equals("B+")){
                grade = 3.5;
            }
            else if(letter.equals("B")){
                grade = 3;
            }
            else if(letter.equals("C+")){
                grade = 2.5;
            }
            else if (letter.equals("C")){
                grade = 2.0;
            }
            else if (letter.equals("D+")){
                grade = 1.5;
            }
            else if (letter.equals("D")){
                grade = 1.0;
            }
            else if(letter.equals("F")){
                grade = 0.0;
            }
            sum = grade*credit;
            total_sum = sum+total_sum;

        }
        GPA = total_sum/total_credit;
        System.out.println("GPA = :" + GPA);

    }
}
