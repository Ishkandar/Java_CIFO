package com.cifolavioleta.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.cifolavioleta.services")
@ComponentScan("com.cifolavioleta.controllers")
public class SpringConfigurador {
	@Bean
	public ViewResolver viewResolver() {
		// esto configura un resolutor de vistas para jsp
		// que es uno de los resolutores mas clasicos
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setExposeContextBeansAsAttributes(true);
		viewResolver.setPrefix("/WEB-INF/vistas/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}
