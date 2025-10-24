package com.ohgun.api.weather.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ohgun.api.common.domain.Messenger;
import com.ohgun.api.weather.domain.WeatherDTO;

@Repository
public class WeatherRepository {

    public Messenger save(WeatherDTO weather) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger delete(int date) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger findById(int date) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

    public Messenger update(WeatherDTO weather) {
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

    public Messenger saveAll(List<WeatherDTO> weathers) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("success");
        return messenger;
    }

}
