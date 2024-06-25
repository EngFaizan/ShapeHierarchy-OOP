
public class Cylinder extends ThreeDimensionalShape{
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double getVolume(){
        return Math.PI*radius*radius*height;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getHeight(){
        return height;
    }
}
