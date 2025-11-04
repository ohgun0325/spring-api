package site.esgaida.api.soccer.schedule.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.schedule.domain.ScheduleDTO;

@Repository
public class ScheduleRepository {

    public Messenger save(ScheduleDTO schedule) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger saveAll(List<ScheduleDTO> schedules) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger deleteById(Long id) {
        return Messenger.builder()
                .code(200)
                .message("데이터 삭제 성공")
                .build();
    }

    public Messenger findById(Long id) {
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

    public Messenger update(ScheduleDTO schedule) {
        return Messenger.builder()
                .code(200)
                .message("데이터 수정 성공")
                .build();
    }
}
