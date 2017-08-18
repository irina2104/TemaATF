import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MethodsTest {
    Methods method;
    @Before
    public void newMethod(){method = new Methods();}

    @Test
    public void testGetString(){
        Assert.assertEquals("Hello!", Methods.getString() );
    }
    @Test
    public void testCat(){
        Assert.assertEquals("Meow", Methods.cat());
    }
    @Test
    public void testMax(){
        Assert.assertEquals((Object)200, Methods.max());
    }
}
