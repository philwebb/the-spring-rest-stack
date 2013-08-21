
package com.joshlong.cms;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.MultiPartConfigFactory;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The main CMS application, acts as both the main configuration and an application
 * launcher.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CmsApplication {

	@Bean
	public ServletRegistrationBean databaseManagementServlet() {
		return new ServletRegistrationBean(new org.h2.server.web.WebServlet(), "/h2/*");
	}

	@Bean
	public MultipartConfigElement multipartConfig() {
		MultiPartConfigFactory configFactory = new MultiPartConfigFactory();
		configFactory.setMaxFileSize("5MB");
		configFactory.setMaxRequestSize("10MB");
		return configFactory.createMultipartConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}

}
