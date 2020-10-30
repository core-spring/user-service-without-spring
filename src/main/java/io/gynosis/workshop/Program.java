package io.gynosis.workshop;

import io.gynosis.workshop.services.UserService;
import io.gynosis.workshop.services.UserServiceImpl;

public class Program {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		
		userService.retrieveAllUsers().forEach(user->System.out.println(user));
	}

}
