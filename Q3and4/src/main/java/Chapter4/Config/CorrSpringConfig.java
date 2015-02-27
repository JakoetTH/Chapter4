package Chapter4.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.lsp.correction.Aeroplane;
import Chapter4.lsp.correction.Helicopter;
import Chapter4.ocp.correction.ocpAeroplane;
import Chapter4.srp.correction.srpAeroplaneImpl;
import Chapter4.srp.correction.srpHelicopterImpl;

@Configuration
public class CorrSpringConfig {
    @Bean(name="lspcorrAeroplane")
    public Aeroplane getlspAeroplane()
    {
        return new Aeroplane();
    }
    @Bean(name="lspcorrHelicopter")
    public Helicopter getlspHelicopter()
    {
        return new Helicopter();
    }
    @Bean(name="ocpcorrAeroplane")
    public ocpAeroplane getocpAeroplane()
    {
        return new ocpAeroplane();
    }
    @Bean(name="srpcorrAeroplane")
    public srpAeroplaneImpl getsrpAeroplaneImpl()
    {
        return new srpAeroplaneImpl();
    }
    @Bean(name="srpcorrHelicopter")
    public srpHelicopterImpl getsrpHelicopterImpl()
    {
        return new srpHelicopterImpl();
    }
}
