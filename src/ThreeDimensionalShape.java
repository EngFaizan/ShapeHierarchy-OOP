
public abstract class ThreeDimensionalShape extends Shape{
    @Override
    public int getNumberofDimensions(){
        return 3;
    }
    
    public abstract double getVolume();
}
