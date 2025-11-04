package site.esgaida.api.usage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.usage.domain.UsageDTO;
import site.esgaida.api.usage.repository.UsageRepository;

@Service
@RequiredArgsConstructor
public class UsageServiceImpl implements UsageService {
    private final UsageRepository usageRepository;

    @Override
    public Messenger save(UsageDTO usage) {
       return usageRepository.save(usage);
    }

    @Override
    public Messenger saveAll(List<UsageDTO> usages) {
        return usageRepository.saveAll(usages);
    }

    @Override
    public Messenger delete(String corporate) {
        return usageRepository.deleteById(corporate);
    }

    @Override
    public Messenger findById(String corporate) {
        return usageRepository.findById(corporate);
    }

    @Override
    public Messenger findAll() {
        return usageRepository.findAll();
    }

    @Override
    public Messenger update(UsageDTO usage) {
        return usageRepository.update(usage);
    }

    
    
}