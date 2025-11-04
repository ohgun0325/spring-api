package site.esgaida.api.soccer.stadium.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.esgaida.api.common.domain.Messenger;
import site.esgaida.api.soccer.stadium.domain.StadiumDTO;
import site.esgaida.api.soccer.stadium.repository.StadiumRepository;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService {
    private final StadiumRepository stadiumRepository;

    @Override
    public Messenger save(StadiumDTO stadium) {
        return stadiumRepository.save(stadium);
    }

    @Override
    public Messenger saveAll(List<StadiumDTO> stadiums) {
        return stadiumRepository.saveAll(stadiums);
    }

    @Override
    public Messenger delete(String stadiumName) {
        return stadiumRepository.deleteById(stadiumName);
    }

    @Override
    public Messenger findById(String stadiumName) {
        return stadiumRepository.findById(stadiumName);
    }

    @Override
    public Messenger findAll() {
        return stadiumRepository.findAll();
    }

    @Override
    public Messenger update(StadiumDTO stadium) {
        return stadiumRepository.update(stadium);
    }

}
