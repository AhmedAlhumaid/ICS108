
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String condition = " ";
        String AmOrPm;


            while(!(condition.equals("n"))){
                System.out.println("enter the time in 24 hour notation ");
                String time = input.next();
                int hours = Integer.parseInt(time.substring(0, 2));
                int minutes = Integer.parseInt(time.substring(3));

                try {
                 time =  timeConverter(time);
                if (hours > 23) {
                    throw new TimeFormatException();
                }
                if (minutes > 59) {
                    throw new TimeFormatException();
                }
                    if(hours>= 12 && hours<24){
                        AmOrPm = "PM";
                    }
                    else{AmOrPm = "AM"; }
                    System.out.println(time+AmOrPm);

            }
                catch (TimeFormatException e){
                    System.out.println(e);
                    System.out.println("there is no such time as " + time + " Try again");
                }


                System.out.println("Again y/n ?");
                condition = input.next();

            }



    }
    public static String timeConverter(String time) throws TimeFormatException{
        String timeInTwelveHour;
       if(Integer.parseInt(time.substring(0,2))>12 && Integer.parseInt(time.substring(0,2)) <24) {
        int hours = Integer.parseInt(time.substring(0,2));
        timeInTwelveHour = Integer.toString(hours-12)+time.substring(2);
        return timeInTwelveHour;}


       else if(Integer.parseInt(time.substring(0,2))<12 && Integer.parseInt(time.substring(0,2)) >0){
           return time;
       }
       else {return "12"+":"+time.substring(3);}
    }
}