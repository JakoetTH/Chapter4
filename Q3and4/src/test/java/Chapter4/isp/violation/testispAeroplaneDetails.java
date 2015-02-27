package Chapter4.isp.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testispAeroplaneDetails {
    private ispAeroplaneDetails aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (ispAeroplaneDetails)ctx.getBean("ispviolAeroplaneDetails");
    }
    @Test
    public void testModel()
    {
        Assert.assertEquals("This is a Boeing-474",aeroplane.Model());
    }
    @After
    public void tearDown()
    {

    }
}
