package com.team9.Voetbal.config;

        import com.team9.Voetbal.entity.Speler;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
        import  org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){
        config.exposeIdsFor(Speler.class);
    }

}
