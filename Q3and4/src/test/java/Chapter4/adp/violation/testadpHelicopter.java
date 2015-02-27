package Chapter4.adp.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testadpHelicopter {
    private adpHelicopter helicopter;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        helicopter = (adpHelicopter)ctx.getBean("adpviolHelicopter");
    }
    @Test
    public void testModel()
    {
        Assert.assertEquals("123", helicopter.Model());
    }
    @After
    public void tearDown()
    {

    }
}