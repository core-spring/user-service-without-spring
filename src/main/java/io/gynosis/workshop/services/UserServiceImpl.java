package io.gynosis.workshop.services;

import java.util.List;

import io.gynosis.workshop.model.User;
import io.gynosis.workshop.repository.InMemoryUserRepositoryImpl;
import io.gynosis.workshop.repository.UserRepository;

public class UserServiceImpl implements UserService{

	// depends on repository
	private UserRepository userRepository = new InMemoryUserRepositoryImpl();
	
	@Override
	public List<User> retrieveAllUsers() {
		return userRepository.retrieveAllUsers();
	}

}
