package site.esgaida.api.soccer.player.service;

import java.util.List;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.player.domain.PlayerDTO;

public interface PlayerService {

    Messenger save(PlayerDTO player);

    Messenger saveAll(List<PlayerDTO> players);

    Messenger delete(String playerName);

    Messenger findById(String playerName);

    Messenger findAll();

    Messenger update(PlayerDTO player);

}
