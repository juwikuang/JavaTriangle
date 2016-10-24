import org.junit.Test;
import static org.junit.Assert.assertEquals;
import triangleapplication.MyMath;

public class MyMathTest {
    @Test
    public void equalsTest()
    {
        org.junit.Assert.assertTrue(MyMath.equals(100,100,0.01));
        org.junit.Assert.assertTrue(MyMath.equals(100,100.1,0.01));
        org.junit.Assert.assertTrue(MyMath.equals(100,101,0.01));
        //swap the two
        org.junit.Assert.assertTrue(MyMath.equals(101,100,0.01));
        org.junit.Assert.assertTrue(!MyMath.equals(100,110,0.01));
        org.junit.Assert.assertTrue(!MyMath.equals(100,200,0.01));
    }
    
}
