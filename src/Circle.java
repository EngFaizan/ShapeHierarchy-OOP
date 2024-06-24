
public class Circle extends TwoDimensionalShape{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double getRadius(){
        return radius;
    }
}
