package fr.slm.doc.avenue.test.acceptance.configuration;

import fr.slm.doc.avenue.test.adapters.dtos.LocalPostService;
import fr.slm.doc.avenue.test.domain.http.services.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExternalServiceConfiguration {

    @Bean
    @Scope("cucumber-glue")
    public PostService getPostService(){
        return new LocalPostService();
    }
}
