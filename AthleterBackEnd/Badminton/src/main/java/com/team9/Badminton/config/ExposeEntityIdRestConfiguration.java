package com.team9.Badminton.config;

import com.team9.Badminton.entity.Athleet;
import com.team9.Badminton.entity.Categorie;
import com.team9.Badminton.entity.Land;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class ExposeEntityIdRestConfiguration implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Athleet.class, Categorie.class, Land.class);
    }
}