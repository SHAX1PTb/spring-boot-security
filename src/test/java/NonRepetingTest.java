import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class NonRepetingTest {

    @Test
    public void nonRepeatTest(){

        NonRepeting nonRepeting = new NonRepeting();

        ;
        Assert.assertEquals("d",nonRepeting.nonRepetingChar("aabbccd"));

    }

}