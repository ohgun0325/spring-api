package com.ohgun.api.user.repository;

import org.springframework.stereotype.Repository;

import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.user.domain.UserDTO;

import java.util.List;

@Repository
public class UserRepository {

    public Messenger save(UserDTO user) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger delete(String id) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger findById(String id) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger update(UserDTO user) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger findAll() {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;

    }

    public Messenger saveAll(List<UserDTO> users) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

}