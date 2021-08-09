package br.com.kururabrewery.web.controller.v2;

import br.com.kururabrewery.service.v2.BeerServiceV2;
import br.com.kururabrewery.web.model.v2.BeerDtoV2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/beer")
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    public BeerControllerV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(beerService.getById(id));
    }

    @PostMapping
    public ResponseEntity<BeerDtoV2> createBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 savedDto = beerService.createBeer(beerDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedDto.getId()).toUri();
        return ResponseEntity.status(HttpStatus.CREATED).location(location).body(savedDto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updateBeer(@PathVariable("id") UUID id, @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteBeer(@PathVariable("id") UUID id) {
        beerService.deleteBeer(id);
        return ResponseEntity.accepted().build();
    }

}
