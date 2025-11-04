package site.esgaida.api.soccer.stadium.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.stadium.domain.StadiumDTO;
import site.esgaida.api.soccer.stadium.service.StadiumService;

@RestController
@RequestMapping("/stadiums")
@RequiredArgsConstructor
public class StadiumController {
    private final StadiumService stadiumService;

    @PostMapping("")
    public Messenger save(StadiumDTO stadium) {
        return stadiumService.save(stadium);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<StadiumDTO> stadiums) {
        return stadiumService.saveAll(stadiums);
    }

    @DeleteMapping("/{stadiumName}")
    public Messenger delete(String stadiumName) {
        return stadiumService.delete(stadiumName);
    }

    @GetMapping("/stadium/{stadiumName}")
    public Messenger findById(String stadiumName) {
        return stadiumService.findById(stadiumName);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return stadiumService.findAll();
    }

    @PutMapping("/{stadiumName}")
    public Messenger update(StadiumDTO stadium) {
        return stadiumService.update(stadium);
    }

}
