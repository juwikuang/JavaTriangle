package triangleapplication;

/**
 *
 * @author Eric
 */
public class Triangle {

    private double lateral1;
    private double lateral2;
    private double lateral3;

    public Triangle(double lateral1, double lateral2, double lateral3) {
        //Check the three laterals, each of them must be larger than 0.
        checkLateral(lateral1);
        checkLateral(lateral2);
        checkLateral(lateral3);
        //The sum of any two laterals must be greater than the third lateral.
        if (lateral1 + lateral2 < lateral3
                || lateral1 + lateral3 < lateral2
                || lateral2 + lateral3 < lateral1) {
            throw new IllegalArgumentException("The sum of any two laterals must be greater than the third lateral.");
        }

        this.lateral1 = lateral1;
        this.lateral2 = lateral2;
        this.lateral3 = lateral3;
    }

    private void checkLateral(double lateral) {
        if (lateral <= 0) {
            throw new IllegalArgumentException("Lateral must be geater than 0");
        }
    }

    public TriangleType getTriangleType() {

        if (lateral1 == lateral2 && lateral2 == lateral3) {
            return TriangleType.EqualLateral;
        } else if (lateral1 != lateral2 && lateral2 != lateral3 && lateral1 != lateral3) {
            return TriangleType.Scalene;
        } else {
            return TriangleType.Isosceles;
        }
    }

    /**
     * @param accuracy accuracy percentage presented by a double. value is between 0 and 1
     */
    public TriangleType getTriangleType(double accuracy) {
        if (MyMath.equals(lateral1, lateral2, accuracy) && MyMath.equals(lateral2, lateral3, accuracy)) {
            return TriangleType.EqualLateral;
        } else if (!MyMath.equals(lateral1, lateral2, accuracy) && !MyMath.equals(lateral2, lateral3, accuracy) && !MyMath.equals(lateral1, lateral3, accuracy)) {
            return TriangleType.Scalene;
        } else {
            return TriangleType.Isosceles;
        }
    }

}
