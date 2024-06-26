
public class Square extends TwoDimensionalShape{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return side*side;
    }
    
    public double getSide(){
        return side;
    }
}
