package Chapter4.adp.correction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.CorrSpringConfig;

public class testadpHelicopterLanding {
    private adpHelicopter helicopter;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(CorrSpringConfig.class);
        helicopter = (adpHelicopter)ctx.getBean("adpcorrHelicopter");
    }
    @Test
    public void testLanding()
    {
        Assert.assertEquals("123", helicopter.Landing());
    }
    @After
    public void tearDown()
    {

    }
}
