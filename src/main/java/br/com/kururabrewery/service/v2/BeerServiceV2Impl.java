package br.com.kururabrewery.service.v2;

import br.com.kururabrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getById(UUID id) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerDtoV2.Style.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 createBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerDtoV2.Style.ALE)
                .build();
    }

    @Override
    public void updateBeer(BeerDtoV2 beerDto) {
        // TODO: update beer
    }

    @Override
    public void deleteBeer(UUID id) {
        // TODO: delete a beer
    }
}
