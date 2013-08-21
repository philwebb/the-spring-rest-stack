package com.joshlong.cms;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@EnableHypermediaSupport
public class MvcRestConfiguration extends RepositoryRestMvcConfiguration {

	// FIXME this may well become a Spring Boot auto-configure

	@Override
	public RequestMappingHandlerMapping repositoryExporterHandlerMapping() {
		RequestMappingHandlerMapping mapping =  super.repositoryExporterHandlerMapping();
		mapping.setOrder(Ordered.LOWEST_PRECEDENCE - 2); // DATAREST-111
		return mapping;
	}

}
