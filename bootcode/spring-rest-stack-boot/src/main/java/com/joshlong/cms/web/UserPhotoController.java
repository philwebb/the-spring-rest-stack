
package com.joshlong.cms.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.joshlong.cms.domain.User;
import com.joshlong.cms.service.UserRepository;

@Controller
@RequestMapping("/users/{userId}/photo")
public class UserPhotoController {

	private final UserRepository userRepository;

	@Autowired
	public UserPhotoController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public HttpEntity<byte[]> getUserProfilePhoto(@PathVariable long userId) {
		User user = userRepository.findOne(userId);
		Assert.state(user != null, "Unable to find user " + userId);
		Assert.state(user.getPhoto() != null, "User " + userId + " has no photo");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.valueOf(user.getPhotoMediaType()));
		return new ResponseEntity<byte[]>(user.getPhoto(), headers, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public HttpEntity<Void> setUserProfilePhoto(@PathVariable Long userId,
			@RequestParam MultipartFile file) throws IOException {
		User user = userRepository.findOne(userId);
		Assert.state(user != null, "You need to specify a valid user ID#");
		user.setPhoto(file.getBytes());
		user.setPhotoMediaType(file.getContentType());
		user = userRepository.save(user);
		// FIXME Links
		HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<Void>(httpHeaders, HttpStatus.ACCEPTED);
	}

}
