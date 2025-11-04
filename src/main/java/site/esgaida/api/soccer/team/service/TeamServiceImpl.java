package site.esgaida.api.soccer.team.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.team.domain.TeamDTO;
import site.esgaida.api.soccer.team.repository.TeamRepository;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
    private final TeamRepository teamRepository;

    @Override
    public Messenger save(TeamDTO team) {
        return teamRepository.save(team);
    }

    @Override
    public Messenger saveAll(List<TeamDTO> teams) {
        return teamRepository.saveAll(teams);
    }

    @Override
    public Messenger delete(String teamId) {
        return teamRepository.deleteById(teamId);
    }

    @Override
    public Messenger findById(String teamId) {
        return teamRepository.findById(teamId);
    }

    @Override
    public Messenger findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Messenger update(TeamDTO team) {
        return teamRepository.update(team);
    }

}
