package Chapter4.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.lsp.violation.Aeroplane;
import Chapter4.lsp.violation.Helicopter;
import Chapter4.ocp.violation.ocpAeroplane;

@Configuration
public class ViolSpringConfig {
    @Bean(name="lspviolAeroplane")
    public Aeroplane getlspAeroplane()
    {
        return new Aeroplane();
    }
    @Bean(name="lspviolHelicopter")
    public Helicopter getlspHelicopter()
    {
        return new Helicopter();
    }
    @Bean(name="ocpviolAeroplane")
    public ocpAeroplane getocpAeroplane()
    {
        return new ocpAeroplane();
    }
}
