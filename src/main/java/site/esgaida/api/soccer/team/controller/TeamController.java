package site.esgaida.api.soccer.team.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.team.domain.TeamDTO;
import site.esgaida.api.soccer.team.service.TeamService;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {
    private final TeamService teamService;

    @PostMapping("")
    public Messenger save(TeamDTO team) {
        return teamService.save(team);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<TeamDTO> teams) {
        return teamService.saveAll(teams);
    }

    @DeleteMapping("/{teamName}")
    public Messenger delete(String teamName) {
        return teamService.delete(teamName);
    }

    @GetMapping("/team/{teamName}")
    public Messenger findById(String teamName) {
        return teamService.findById(teamName);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return teamService.findAll();
    }

    @PutMapping("/{teamName}")
    public Messenger update(TeamDTO team) {
        return teamService.update(team);
    }

}
