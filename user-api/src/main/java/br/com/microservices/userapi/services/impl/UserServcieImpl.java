package br.com.microservices.userapi.services.impl;

import br.com.microservices.userapi.domain.User;
import br.com.microservices.userapi.repositories.UserRepository;
import br.com.microservices.userapi.services.UserService;
import br.com.microservices.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServcieImpl implements UserService {

    private final Environment environment;
    private final UserRepository userRepository;


    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request  on " + environment.getProperty("local.server.port") +  "port");
        return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
