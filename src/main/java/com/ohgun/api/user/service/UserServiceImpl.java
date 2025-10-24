package com.ohgun.api.user.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.user.domain.UserDTO;
import com.ohgun.api.user.repository.UserRepository;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
private final UserRepository userRepository;

@Override
public Messenger save(UserDTO user) {
    return userRepository.save(user);
}

@Override
public Messenger delete(String id) {
    return userRepository.delete(id);
  
}

@Override
public Messenger findById(String id) {
    return userRepository.findById(id);
   
}

@Override
public Messenger update(UserDTO user) {
    return userRepository.update(user);
}

@Override
public Messenger findAll() {
    return userRepository.findAll();
}

@Override
public Messenger saveAll(List<UserDTO> users) {
    return userRepository.saveAll(users);
}

   
}


