
package com.joshlong.cms.web;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

import com.joshlong.cms.domain.User;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

@Component
public class UserResourceProcessor implements ResourceProcessor<Resource<User>> {

	@Override
	public Resource<User> process(Resource<User> resource) {
		resource.add(linkTo(methodOn(UserPhotoController.class).getUserProfilePhoto(0L)).withRel(
				"photo"));
		return resource;
	}

}
