package Chapter4.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.lsp.correction.Aeroplane;
import Chapter4.lsp.correction.Helicopter;
import Chapter4.ocp.correction.ocpAeroplane;

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
}

