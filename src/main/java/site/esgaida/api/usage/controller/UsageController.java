package site.esgaida.api.usage.controller;
import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.usage.domain.UsageDTO;
import site.esgaida.api.usage.service.UsageService;

@RestController
@RequestMapping("/usages")
@RequiredArgsConstructor
public class UsageController{
    private final UsageService usageService;

   @PostMapping("")
    public Messenger save(UsageDTO usage) {
        return usageService.save(usage);
    }

    @PostMapping("/all")
    public Messenger saveAll(List<UsageDTO> usages) {
         return usageService.saveAll(usages);
    }

    @DeleteMapping("/{corporate}")
    public Messenger delete(String corporate) {
        return usageService.delete(corporate);
    }

    @GetMapping("/corporate/{corporate}")
    public Messenger findById(String corporate) {
        return usageService.findById(corporate);
    }

    @GetMapping("/all")
    public Messenger findAll() {
        return usageService.findAll();
    }

    @PutMapping("/{corporate}")
    public Messenger update(UsageDTO usage) {
        return usageService.update(usage);
    }

    
    
}
