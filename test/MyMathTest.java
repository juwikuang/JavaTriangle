import org.junit.Test;
import static org.junit.Assert.assertTrue;
import triangleapplication.MyMath;

public class MyMathTest {
    @Test
    public void equalsTest()
    {
        assertTrue(MyMath.equals(100,100,0.01));
        assertTrue(MyMath.equals(100,100.1,0.01));
        assertTrue(MyMath.equals(100,101,0.01));
        //swap the two
        assertTrue(MyMath.equals(101,100,0.01));
        assertTrue(!MyMath.equals(100,110,0.01));
        assertTrue(!MyMath.equals(100,200,0.01));
    }
    
}
