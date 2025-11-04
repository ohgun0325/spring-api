package site.esgaida.api.soccer.player.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.player.domain.PlayerDTO;
import site.esgaida.api.soccer.player.service.PlayerService;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @PostMapping("")
    public Messenger save(PlayerDTO player) {
        return playerService.save(player);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<PlayerDTO> players) {
        return playerService.saveAll(players);
    }

    @DeleteMapping("/{playerName}")
    public Messenger delete(String playerName) {
        return playerService.delete(playerName);
    }

    @GetMapping("/player/{playerName}")
    public Messenger findById(String playerName) {
        return playerService.findById(playerName);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return playerService.findAll();
    }

    @PutMapping("/{playerName}")
    public Messenger update(PlayerDTO player) {
        return playerService.update(player);
    }

}
