package Spring.Webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Spring.Webapp.MyController;

@Configuration
public class MyConfiguration {
	@Bean
	public MyController myController() {
		return new MyController();
	}
}
