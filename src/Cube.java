
public class Cube extends ThreeDimensionalShape{
    private double side;
    
    public Cube(double side){
        this.side = side;
    }
    
    @Override
    public double getVolume(){
        return side*side*side;
    }
    
    public double getSide(){
        return side;
    }
}
