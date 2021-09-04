import com.agro.analytics.java8.lambda.junit.Calculator;
import com.agro.analytics.java8.lambda.junit.CalculatorTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.util.Assert;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatorTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

        Assert
                TestCase
    }

}