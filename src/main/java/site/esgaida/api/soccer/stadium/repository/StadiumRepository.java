package site.esgaida.api.soccer.stadium.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.stadium.domain.StadiumDTO;

@Repository
public class StadiumRepository {

    public Messenger save(StadiumDTO stadium) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger saveAll(List<StadiumDTO> stadiums) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger deleteById(String stadiumName) {
        return Messenger.builder()
                .code(200)
                .message("데이터 삭제 성공")
                .build();
    }

    public Messenger findById(String stadiumName) {
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

    public Messenger update(StadiumDTO stadium) {
        return Messenger.builder()
                .code(200)
                .message("데이터 수정 성공")
                .build();
    }
}
