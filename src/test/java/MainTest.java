
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author GrayCat.
 * @date 2021/11/29 15:26
 */
public class MainTest {

    @Test
    public void testPrintHelloWorld() {

        Assert.assertEquals(Main.getHelloWorld(), "Hello World");
        System.out.println("in test .hello.");
    }
}
