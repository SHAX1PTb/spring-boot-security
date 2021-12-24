import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class GoldmanSachsTest {

    @Test
    public void TestMaxAverage(){

        GoldmanSachs goldmanSachs = new GoldmanSachs();
        String[][] sList = { { "James", "70" }, { "Mark", "80" }, { "Bash", "75" }, { "Mark", "80" } };

    Assert.assertEquals(Integer.valueOf(75),goldmanSachs.maxAvgCalculator(sList));

    }

}