import java.lang.Math;

public class pythagoreanTheorem{
    public double calculateHypotenuse( int legA, int legB){
        Double c= Math.sqrt( ((legA) * (legA)) + ((legB) * (legB)));
        return c;

    }
}
