package site.esgaida.api.soccer.schedule.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.schedule.domain.ScheduleDTO;
import site.esgaida.api.soccer.schedule.service.ScheduleService;

@RestController
@RequestMapping("/schedules")
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("")
    public Messenger save(ScheduleDTO schedule) {
        return scheduleService.save(schedule);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<ScheduleDTO> schedules) {
        return scheduleService.saveAll(schedules);
    }

    @DeleteMapping("/{id}")
    public Messenger delete(Long id) {
        return scheduleService.delete(id);
    }

    @GetMapping("/schedule/{id}")
    public Messenger findById(Long id) {
        return scheduleService.findById(id);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return scheduleService.findAll();
    }

    @PutMapping("/{id}")
    public Messenger update(ScheduleDTO schedule) {
        return scheduleService.update(schedule);
    }

}
