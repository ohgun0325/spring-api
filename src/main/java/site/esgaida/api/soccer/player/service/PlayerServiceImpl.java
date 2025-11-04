package site.esgaida.api.soccer.player.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.player.domain.PlayerDTO;
import site.esgaida.api.soccer.player.repository.PlayerRepository;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Override
    public Messenger save(PlayerDTO player) {
        return playerRepository.save(player);
    }

    @Override
    public Messenger saveAll(List<PlayerDTO> players) {
        return playerRepository.saveAll(players);
    }

    @Override
    public Messenger delete(String playerName) {
        return playerRepository.deleteById(playerName);
    }

    @Override
    public Messenger findById(String playerName) {
        return playerRepository.findById(playerName);
    }

    @Override
    public Messenger findAll() {
        return playerRepository.findAll();
    }

    @Override
    public Messenger update(PlayerDTO player) {
        return playerRepository.update(player);
    }

}
