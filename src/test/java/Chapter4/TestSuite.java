package Chapter4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestFly.class,
        TestLand.class,
        TestSerial.class,
})
public class TestSuite {
}
