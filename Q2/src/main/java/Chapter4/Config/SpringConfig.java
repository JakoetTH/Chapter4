package Chapter4.Config;

import Chapter4.Impl.Helicopter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {
    @Bean(name="HelicopterBean")
    public Helicopter getHelicopter() { return new Helicopter();}

}
