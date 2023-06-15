import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point[] pointsArr = new Point[3];
        pointsArr[0] =  new Point(1,-2);
        pointsArr[1] = new Point(1,0);
        pointsArr[2] = new Point(1,2);
        System.out.println(Arrays.toString(pointsArr));
        Arrays.sort(pointsArr);
        System.out.println(Arrays.toString(pointsArr));
    }
}