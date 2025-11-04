package site.esgaida.api.soccer.schedule.service;

import java.util.List;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.schedule.domain.ScheduleDTO;

public interface ScheduleService {

    Messenger save(ScheduleDTO schedule);

    Messenger saveAll(List<ScheduleDTO> schedules);

    Messenger delete(Long id);

    Messenger findById(Long id);

    Messenger findAll();

    Messenger update(ScheduleDTO schedule);

}
