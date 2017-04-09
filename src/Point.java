/**
 * Created by user on 12.03.2017.
 */
public class Point {
    double x;
    double y;
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public double getLenght(Point a){
        return Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));

    }
}
