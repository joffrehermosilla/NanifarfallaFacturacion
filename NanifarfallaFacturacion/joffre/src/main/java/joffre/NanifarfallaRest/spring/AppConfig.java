package joffre.NanifarfallaRest.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import joffre.NanifarfallaRest.security.ActiveUserStore;

@Configuration
public class AppConfig {
    // beans

    @Bean
    public ActiveUserStore activeUserStore() {
        return new ActiveUserStore();
    }

}