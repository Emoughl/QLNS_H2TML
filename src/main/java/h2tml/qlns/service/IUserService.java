package h2tml.qlns.service;

import h2tml.qlns.web.dto.UserRegistrationDto;
import h2tml.qlns.model.User;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
    User findByUsername(String username);
	List<User> findAll();
    
    
}
