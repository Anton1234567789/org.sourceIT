import com.company.Fraction;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionTest {
    private Fraction fraction = new Fraction(3,4);
    private Fraction fraction1 = new Fraction(5,6);

    @Test
    public void testSum(){
        Assert.assertEquals(fraction.add(fraction,fraction1),new Fraction(38,24));
    }

    @Test
    public void testSub(){
        Assert.assertEquals(fraction.sub(fraction,fraction1),new Fraction(-2,24));
    }
    @Test
    public void testMov(){
        Assert.assertEquals(fraction.mov(fraction,fraction1),new Fraction(15,24));
    }
    @Test
    public void testDiv(){
        Assert.assertEquals(fraction.div(fraction,fraction1),new Fraction(18,20));
    }
    @Test
    public void testDoubleSum(){
        Assert.assertEquals(fraction.toDoubleSum(fraction,fraction1), 1.5833333333333333);
    }
    @Test
    public void testDoubleSub(){
        Assert.assertEquals(fraction.toDoubleSub(fraction,fraction1), -0.08333333333333333);
    }
    @Test
    public void testDoubleMov(){
        Assert.assertEquals(fraction.toDoubleMov(fraction,fraction1), 0.625);
    }
    @Test
    public void testDoubleDiv(){
        Assert.assertEquals(fraction.toDoubleDiv(fraction,fraction1), 0.9);
    }

}
