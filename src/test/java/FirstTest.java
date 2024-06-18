import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FirstTest {

//КРАТНО 3, ВОЗВРАЩАТЬ 'T'
//КРАТНО 5, ВОЗВРАЩАТЬ 'M'
//КРАТНО 3 И 5, ВОЗВРАЩАТЬ 'ЕMС'
// ВОЗВРАЩАТЬ 'FAIL'

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "ЕMC";

        } else if (number % 3 == 0) {
            return "T";
        } else if (number % 5 == 0) {
            return "M";

        } else return "FAIL";
    }

    @Test
    public void tmcTest() {
        String actualResult = trialCode(9);
        assertEquals(actualResult, "T");
    }

    @Test
    public void tmcTest1() {
        String actualResult = trialCode(10);
        assertEquals(actualResult, "M");
    }

    @Test
    public void tmcTest2() {
        String actualResult = trialCode(15);
        assertEquals(actualResult, "ЕMC");
    }

    @Test
    public void tmcTest3() {
        String actualResult = trialCode(17);
        assertEquals(actualResult, "FAIL", "The returned value does not correspond");
    }
}
