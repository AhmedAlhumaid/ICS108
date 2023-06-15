

public class Point {
    private double x_Coordinate;
    private double y_Coordinate;
    Point(){
        y_Coordinate = 0;
        x_Coordinate = 0;
    }
    Point(double x,double y ){
        x_Coordinate = x;
        y_Coordinate = y;
    }
     double get_XCoordinate(){
        return x_Coordinate;

    }
    double get_YCoordinate(){
        return y_Coordinate;
    }
    double distance(Point p2){

        double distance = Math.pow(Math.pow(x_Coordinate-p2.get_XCoordinate(),2) + Math.pow(y_Coordinate-p2.get_YCoordinate(),2),0.5);
        return distance;
    }

}
