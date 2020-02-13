package com.example.SpringBoot_Project.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.SpringBoot_Project.exception.UserNotFound;

@RestController
public class UserBeanControler {
	@Autowired
	private UserResource userResource;
	
	@GetMapping("/users")
	public List<UserBean> retriveUsers()
	{
		return userResource.retriveUsers();
	}
	@GetMapping("/users/userId/{userId}")
	public UserBean retriveUser(@PathVariable int userId)
	{
		UserBean userBean=userResource.retriveUser(userId);
		if(userBean==null)
		{
			throw new UserNotFound("/users/userId/"+userId+"  not available");
		}
		return userBean;
	}
	@PostMapping("/users")
	public ResponseEntity<Object> addUser(@Valid @RequestBody UserBean userBean)
	{
		UserBean userBeanObj=userResource.save(userBean);
		URI location=ServletUriComponentsBuilder.fromCurrentRequestUri().
				path("userId/{userId}").buildAndExpand(userBean.getUserId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	@DeleteMapping("/users/userId/{userId}")
	public void deleteUser(@PathVariable int userId)
	{
		UserBean userBean=userResource.delete(userId);
		if(userBean==null)
		{
			throw new UserNotFound("/users/userId/"+userId+"  not available");
		}
	}

}
