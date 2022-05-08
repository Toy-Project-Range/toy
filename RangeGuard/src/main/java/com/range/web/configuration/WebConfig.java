package com.range.web.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class WebConfig {
	@Value("${spring.mvc.view.prefix}")
	private String prefix;
	
	@Value("${spring.mvc.view.suffix}")
	private String suffix;
	
	@Bean
	public ViewResolver InternalViewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix(prefix);
		irvr.setSuffix(suffix);
		irvr.setViewClass(JstlView.class);
		return irvr;
	}
}
