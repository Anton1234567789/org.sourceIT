import com.company.Fraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionTest {
    private Fraction fraction = new Fraction();

    @Test
    public void testSum(){
        Assert.assertEquals(fraction.sumFraction(3,5,5,7),46+"/"+35);
    }
    @Test
    public void testToDiv(){
        Assert.assertEquals(fraction.toDiv(3,5,5,7),21+"/"+25);

    }
    @Test
    public void testToMov(){
        Assert.assertEquals(fraction.toMov(3,7,8,9),24+"/"+63);
    }
    @Test
    public void testToSub(){
        Assert.assertEquals(fraction.toSub(3,9,5,6),-27+"/"+54);
    }
    @Test
    public void testToDoubleSum(){
        Assert.assertEquals(fraction.doDoubleSum(3,5,5,7),1.3142857142857143);
    }
    @Test
    public void testToDoubleDiv(){
        Assert.assertEquals(fraction.doDoubleDiv(3,5,5,7),0.84);
    }
    @Test
    public void testToDoubleMov(){
        Assert.assertEquals(fraction.doDoubleMov(3,2,2,3),1.0);
    }
    @Test
    public void testToDoubleSub(){
        Assert.assertEquals(fraction.doDoubleSub(3,5,7,3),-1.7333333333333334);
    }

}
