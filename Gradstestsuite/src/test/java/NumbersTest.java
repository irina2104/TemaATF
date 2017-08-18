import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NumbersTest {
    Numbers number;
    @Before
    public void newNumber(){number = new Numbers();}

    @Test
    public void testIsSmaller(){
        Assert.assertTrue("True",number.isSmallerThanOneHundred(24));
    }
    @Test
    public void test2IsSmaller(){
        Assert.assertFalse("False",number.isSmallerThanOneHundred(504));
    }
    @Test
    public void testCheckSum(){
        Assert.assertEquals("FAIL!", number.checkSum(3,4,2));
    }
    @Test
    public void test2CheckSum(){
        Assert.assertEquals("SUCCESS!", number.checkSum(7,3,10));
    }
    @Test
    public void testFactorial(){
       Assert.assertEquals((Object)120, (Object) number.factorial(5));
    }




}
