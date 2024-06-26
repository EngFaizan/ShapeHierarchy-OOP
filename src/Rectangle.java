
public class Rectangle extends TwoDimensionalShape{
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
}
