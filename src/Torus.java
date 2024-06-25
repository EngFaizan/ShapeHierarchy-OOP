
public class Torus extends ThreeDimensionalShape{
    private double majorRadius;
    private double minorRadius;
    
    public Torus(double majorRadius, double minorRadius){
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }
    
    @Override
    public double getVolume(){
        double majorRVolume = 2*Math.PI*majorRadius;
        double minorRVolume = Math.PI*minorRadius*minorRadius;
        
        return majorRVolume * minorRVolume;
    }
    
    public double getMajorRadius(){
        return majorRadius;
    }
    
    public double getMinorRadius(){
        return minorRadius;
    }
}
