package site.esgaida.api.usage.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.usage.domain.UsageDTO;

@Repository
public class UsageRepository {

    public Messenger save(UsageDTO usage) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger saveAll(List<UsageDTO> usages) {
        return Messenger.builder()
                .code(200)
                .message("데이터 저장 성공")
                .build();
    }

    public Messenger deleteById(String corporate) {
        return Messenger.builder()
                .code(200)
                .message("데이터 삭제 성공")
                .build();
    }

    public Messenger findById(String corporate) {
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

    public Messenger update(UsageDTO usage) {
        return Messenger.builder()
                .code(200)
                .message("데이터 수정 성공")
                .build();
    }
}