import org.junit.Test;
import triangleapplication.Triangle;
import triangleapplication.TriangleType;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Eric
 */
public class TriangleTest {

    @Test(expected = IllegalArgumentException.class)
    public void lateralTest() {
        Triangle t1 = new Triangle(-1, 1, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void smokingTest() {

        Triangle t1 = new Triangle(1, 1, 3);
    }

    @Test
    public void equalLateralTest() {
        Triangle t1 = new Triangle(2, 2, 2);
        TriangleType actual = t1.getTriangleType();
        TriangleType expected = TriangleType.EqualLateral;
        assertEquals(expected, actual);
    }

    @Test
    public void isoscelesTest() {
        Triangle t1 = new Triangle(3, 3, 4);
        TriangleType actual = t1.getTriangleType();
        TriangleType expected = TriangleType.Isosceles;
        assertEquals(expected, actual);
    }

    @Test
    public void scaleneTest() {
        Triangle t1 = new Triangle(3, 4, 5);
        TriangleType actual = t1.getTriangleType();
        TriangleType expected = TriangleType.Scalene;
        assertEquals(expected, actual);
    }
    
    //the same tests with accuracy
    @Test
    public void equalLateralAccuracyTest() {
        Triangle t1 = new Triangle(2, 2, 2);
        TriangleType actual = t1.getTriangleType(0.01);
        TriangleType expected = TriangleType.EqualLateral;
        assertEquals(expected, actual);
    }

    @Test
    public void isoscelesAccuracyTest() {
        Triangle t1 = new Triangle(3, 3, 4);
        TriangleType actual = t1.getTriangleType(0.01);
        TriangleType expected = TriangleType.Isosceles;
        assertEquals(expected, actual);
    }

    @Test
    public void scaleneAccuracyTest() {
        Triangle t1 = new Triangle(3, 4, 5);
        TriangleType actual = t1.getTriangleType(0.01);
        TriangleType expected = TriangleType.Scalene;
        assertEquals(expected, actual);
    }
}
