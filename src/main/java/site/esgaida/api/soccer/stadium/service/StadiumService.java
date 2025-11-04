package site.esgaida.api.soccer.stadium.service;

import java.util.List;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.stadium.domain.StadiumDTO;

public interface StadiumService {

    Messenger save(StadiumDTO stadium);

    Messenger saveAll(List<StadiumDTO> stadiums);

    Messenger delete(String stadiumName);

    Messenger findById(String stadiumName);

    Messenger findAll();

    Messenger update(StadiumDTO stadium);

}
