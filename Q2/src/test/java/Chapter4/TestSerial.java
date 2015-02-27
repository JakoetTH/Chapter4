package Chapter4;

import Chapter4.Config.SpringConfig;
import Chapter4.Impl.Helicopter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSerial {
    private Helicopter helicopter;
    private ApplicationContext ctx;

    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        helicopter = (Helicopter)ctx.getBean("HelicopterBean");
    }
    @Test
    public void testFlyHelicopter() throws Exception
    {
        Assert.assertEquals("AOE-123",helicopter.airlineequipment.generateSerialNumber());
    }
    @After
    public void tearDown()
    {

    }
}
