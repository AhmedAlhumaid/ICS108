public class Point implements Comparable<Point> {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            Point other = (Point) obj;
            if(this.x == other.x && this.y == other.y){
                return true;
            }
            else{return false;}

        }
        else{return false;}
    }
    public int compareTo(Point p){
        if(this.x>p.x){return 1;}
        else if (this.x <p.x){return -1;}
        else{
            if(this.y>p.y){return 1;}
            else if(this.y <p.y){return -1;}
            else{return 0;}

        }

    }


    public String toString(){
        return"point"+ "("+this.x+","+this.y+")";
    }
}
