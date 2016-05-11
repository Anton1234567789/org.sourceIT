import com.company.ComplexFraction;
import com.company.ComplexNumber;
import com.company.Fraction;
import com.company.FractionComplex;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionComplexTest {

    ComplexFraction complexFraction1 = new ComplexFraction(new ComplexNumber(2,3),new ComplexNumber(2,6));
    ComplexFraction complexFraction2 = new ComplexFraction(new ComplexNumber(2,4), new ComplexNumber(5,3));

    @Test
    public void testAdd(){
        Assert.assertEquals(complexFraction1.add(complexFraction2).equals(new ComplexFraction(complexFraction1.getNums().mov(complexFraction2.getDenum()).
                plus(complexFraction1.getDenum().mov(complexFraction2.getNums())),
                complexFraction1.getDenum().mov(complexFraction2.getDenum()))), false);
    }

    @Test
    public void testSubstract() {
        Assert.assertEquals(complexFraction1.sub(complexFraction1).equals(new ComplexFraction(complexFraction1.getNums().mov(complexFraction2.getDenum()).
                sub(complexFraction1.getDenum().mov(complexFraction2.getNums())),
                complexFraction1.getDenum().mov(complexFraction2.getDenum()))), false);
    }

    @Test
    public void testMov(){
        Assert.assertEquals(complexFraction1.mov(complexFraction2).equals(new ComplexFraction(complexFraction1.getNums().mov(complexFraction2.getNums()),
        complexFraction1.getDenum().mov(complexFraction2.getDenum()))),false);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(complexFraction1.div(complexFraction1).equals(new ComplexFraction(complexFraction1.getNums().mov(complexFraction2.getDenum()),
                complexFraction1.getDenum().mov(complexFraction2.getNums()))), false);
    }


}
