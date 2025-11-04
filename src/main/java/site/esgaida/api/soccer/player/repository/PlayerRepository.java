package site.esgaida.api.soccer.player.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.player.domain.PlayerDTO;

@Repository
public class PlayerRepository {

    public Messenger save(PlayerDTO player) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger saveAll(List<PlayerDTO> players) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger deleteById(String playerName) {
        return Messenger.builder()
                .code(200)
                .message("데이터 삭제 성공")
                .build();
    }

    public Messenger findById(String playerName) {
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

    public Messenger update(PlayerDTO player) {
        return Messenger.builder()
                .code(200)
                .message("데이터 수정 성공")
                .build();
    }
}
