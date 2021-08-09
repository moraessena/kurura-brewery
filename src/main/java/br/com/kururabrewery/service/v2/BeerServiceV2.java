package br.com.kururabrewery.service.v2;

import br.com.kururabrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {

    BeerDtoV2 getById(UUID id);

    BeerDtoV2 createBeer(BeerDtoV2 beerDto);

    void updateBeer(BeerDtoV2 beerDto);

    void deleteBeer(UUID id);
}
