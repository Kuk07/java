import java.util.*; 

class Circle {
    private int radius; 
    private Point center; 

    public Circle(){
        this.radius = 1; 
        this.center = new Point(0,0);
    }

    public Circle(int radius){ 
        this.radius = radius;
        this.center = new Point(0,0);
    }

    public Circle(Point center){ 
        this.radius = 1;
        this.center = center;   
    } 

    public Circle(int radius, Point center){
        this.radius = radius; 
        this.center = center; 
    }

    double area() {
        return Math.PI * radius * radius; 
    }

    double circumference(){
        return 2 * Math.PI * radius; 
    }

    public String toString( ){
        String s = "radius: " + radius + "center: " + center; 
        return s; 
    }
}
