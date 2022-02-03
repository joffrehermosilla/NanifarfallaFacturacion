package joffre.NanifarfallaRest.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "joffre.NanifarfallaRest.task" })
public class SpringTaskConfig {

}
