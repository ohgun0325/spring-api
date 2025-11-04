package site.esgaida.api.usage.service;


import java.util.List;

import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.usage.domain.UsageDTO;

public interface UsageService {

    Messenger save(UsageDTO usage);

    Messenger saveAll(List<UsageDTO> usages);

    Messenger delete(String corporate);

    Messenger findById(String corporate);

    Messenger findAll();

    Messenger update(UsageDTO usage);

}