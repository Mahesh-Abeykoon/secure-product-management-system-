package lk.ilabs.product.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import lk.ilabs.product.model.User;
import lk.ilabs.product.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
