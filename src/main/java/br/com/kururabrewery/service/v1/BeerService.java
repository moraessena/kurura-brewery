package br.com.kururabrewery.service.v1;

import br.com.kururabrewery.web.model.v1.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID id);

    BeerDto createBeer(BeerDto beerDto);

    void updateBeer(BeerDto beerDto);

    void deleteBeer(UUID id);
}
