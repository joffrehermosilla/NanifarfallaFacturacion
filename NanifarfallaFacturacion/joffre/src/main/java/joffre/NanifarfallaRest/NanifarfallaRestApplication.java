package joffre.NanifarfallaRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.ErrorPageFilter;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@ComponentScan("joffre.NanifarfallaRest")
@SpringBootApplication
@EnableJpaAuditing
public class NanifarfallaRestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NanifarfallaRestApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(NanifarfallaRestApplication.class);
    }	
	
	
	
	  @Bean public ErrorPageFilter errorPageFilter() { return new
	  ErrorPageFilter(); }
	  
	  @Bean public FilterRegistrationBean<ErrorPageFilter>
	  disableSpringBootErrorFilter(ErrorPageFilter filter) {
	  FilterRegistrationBean<ErrorPageFilter> filterRegistrationBean = new
	  FilterRegistrationBean<ErrorPageFilter>();
	  filterRegistrationBean.setFilter(filter);
	  filterRegistrationBean.setEnabled(false); return filterRegistrationBean; }
	 
	
	/*
	 * public NanifarfallaRestApplication() { super();
	 * setRegisterErrorPageFilter(false); // <- this one }
	 */

}
