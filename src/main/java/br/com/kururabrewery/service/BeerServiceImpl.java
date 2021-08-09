package br.com.kururabrewery.service;

import br.com.kururabrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getById(UUID id) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public void updateBeer(BeerDto beerDto) {
        // TODO: update beer
    }

    @Override
    public void deleteBeer(UUID id) {
        log.debug("Deleting beer {}", id);
        // TODO: delete a beer
    }
}
