package site.esgaida.api.soccer.team.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.team.domain.TeamDTO;

@Repository
public class TeamRepository {

    public Messenger save(TeamDTO team) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger saveAll(List<TeamDTO> teams) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger deleteById(String teamName) {
        return Messenger.builder()
                .code(200)
                .message("데이터 삭제 성공")
                .build();
    }

    public Messenger findById(String teamName) {
        return Messenger.builder()
                .code(200)
                .message("데이터 조회 성공")
                .build();
    }

    public Messenger findAll() {
        return Messenger.builder()
                .code(200)
                .message("데이터 조회 성공")
                .build();
    }

    public Messenger update(TeamDTO team) {
        return Messenger.builder()
                .code(200)
                .message("데이터 수정 성공")
                .build();
    }
}
