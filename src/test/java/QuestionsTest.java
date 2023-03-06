import org.junit.Assert;
import org.junit.Test;

public class QuestionsTest {
    Questions q = new Questions();

    @Test
    public void testQuestion1() {
        int expectedResult = 3;
        int actualResult = q.question1();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testQuestion2() {
        int expectedResult = 8;
        int actualResult = q.question2();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testQuestion3() {
        String expectedResult = "string";
        String actualResult = q.question3();
        Assert.assertEquals(expectedResult, actualResult.toLowerCase());
    }
}
