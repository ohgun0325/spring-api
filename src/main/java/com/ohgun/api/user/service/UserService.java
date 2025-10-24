package com.ohgun.api.user.service;

import java.util.List;

import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.user.domain.UserDTO;

public interface UserService {

    Messenger save(UserDTO user);
    Messenger delete(String id);
    Messenger findById(String id);
    Messenger update(UserDTO user);
    Messenger findAll();
    Messenger saveAll(List<UserDTO> users);
}