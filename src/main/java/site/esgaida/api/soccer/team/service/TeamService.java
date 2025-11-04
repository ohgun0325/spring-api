package site.esgaida.api.soccer.team.service;

import java.util.List;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.team.domain.TeamDTO;

public interface TeamService {

    Messenger save(TeamDTO team);

    Messenger saveAll(List<TeamDTO> teams);

    Messenger delete(String teamId);

    Messenger findById(String teamId);

    Messenger findAll();

    Messenger update(TeamDTO team);

}
