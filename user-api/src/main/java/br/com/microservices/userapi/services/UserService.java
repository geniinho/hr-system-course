package br.com.microservices.userapi.services;

import br.com.microservices.userapi.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
