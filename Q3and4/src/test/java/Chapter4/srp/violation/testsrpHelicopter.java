package Chapter4.srp.violation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testsrpHelicopter {
    private srpHelicopter helicopter;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        helicopter = (srpHelicopter)ctx.getBean("srpviolHelicopter");
    }
    @Test
    public void testHelicopter()
    {
        Assert.assertEquals("This is an aeroplane.",helicopter.Helicopter());
    }
    @After
    public void tearDown()
    {

    }
}
