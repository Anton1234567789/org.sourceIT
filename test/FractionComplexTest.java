import com.company.Fraction;
import com.company.FractionComplex;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FractionComplexTest {
    FractionComplex a =new FractionComplex(3,4,2,3);
    FractionComplex b =new FractionComplex(2,3,5,3);
    @Test
    public void testSum(){
        Assert.assertEquals(a.add(b),new FractionComplex(19,20,10,12));
    }
    @Test
    public void testSub(){
        Assert.assertEquals(a.sub(b),new FractionComplex(11,14,10,12));
    }
    @Test
    public void testMov(){
        Assert.assertEquals(a.mov(b),new FractionComplex(6,5,10,12));
    }
    @Test
    public void testDiv(){
        Assert.assertEquals(a.div(b),new FractionComplex(15,17,4,3));
    }
    @Test
    public void testDoubleSum(){
        Assert.assertEquals(a.toDoubleSum(b), 1.7727272727272727);
    }
    @Test
    public void testDoubleSub(){
        Assert.assertEquals(a.toDoubleSub(b), 1.1363636363636365);
    }
    @Test
    public void testDoubleMov(){
        Assert.assertEquals(a.toDoubleMov(b), 0.5);
    }
    @Test
    public void testDoubleDiv(){
        Assert.assertEquals(a.toDoubleDiv(b), 4.571428571428571);
    }


}
