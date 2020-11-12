package com.cifolavioleta.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import com.cifolavioleta.services.*;

public class SpringWebInicializador implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// volvemos a escribir la configuracion basada en anotaciones:
		AnnotationConfigWebApplicationContext contexto = new AnnotationConfigWebApplicationContext();
		// registro de las clases de configuracion
		contexto.register(SpringConfigurador.class);
		contexto.setServletContext(servletContext);
		
		// un servlet que haga de controlador frontal y despache
		// todas las peticiones hacia las vistas y controladores:
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispacher", new DispatcherServlet(contexto));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		// hemos dado de alta el servlet que iniciará con la aplicación
		// y estará disponible en '/'
	}

}
