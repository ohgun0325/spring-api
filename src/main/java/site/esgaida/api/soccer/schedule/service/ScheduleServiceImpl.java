package site.esgaida.api.soccer.schedule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.schedule.domain.ScheduleDTO;
import site.esgaida.api.soccer.schedule.repository.ScheduleRepository;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Override
    public Messenger save(ScheduleDTO schedule) {
        return scheduleRepository.save(schedule);
    }

    @Override
    public Messenger saveAll(List<ScheduleDTO> schedules) {
        return scheduleRepository.saveAll(schedules);
    }

    @Override
    public Messenger delete(Long id) {
        return scheduleRepository.deleteById(id);
    }

    @Override
    public Messenger findById(Long id) {
        return scheduleRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Messenger update(ScheduleDTO schedule) {
        return scheduleRepository.update(schedule);
    }

}
