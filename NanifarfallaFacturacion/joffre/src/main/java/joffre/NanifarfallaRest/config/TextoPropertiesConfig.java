package joffre.NanifarfallaRest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties")
	
})
public class TextoPropertiesConfig {

}
