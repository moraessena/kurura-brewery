package br.com.kururabrewery.service;

import br.com.kururabrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID id);

    BeerDto createBeer(BeerDto beerDto);

    void updateBeer(BeerDto beerDto);
}
