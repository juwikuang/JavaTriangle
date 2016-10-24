package triangleapplication;

/**
 *
 * @author Eric
 */
public class MyMath {

    public static boolean equals(double a, double b, double accuracy) {
        //Alway the small number divide by the big.
        //otherwise, swaping the two would give different results.
        double numerator = Math.min(a, b);
        double denominator = Math.max(a, b);
        double frac = numerator / denominator;
        return (Math.abs(frac - 1.0) < accuracy);
    }
}
