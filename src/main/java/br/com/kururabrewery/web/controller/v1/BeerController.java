package br.com.kururabrewery.web.controller.v1;

import br.com.kururabrewery.service.v1.BeerService;
import br.com.kururabrewery.web.model.v1.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(beerService.getById(id));
    }

    @PostMapping
    public ResponseEntity<BeerDto> createBeer(@RequestBody BeerDto beerDto) {
        BeerDto savedDto = beerService.createBeer(beerDto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedDto.getId()).toUri();
        return ResponseEntity.status(HttpStatus.CREATED).location(location).body(savedDto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> updateBeer(@PathVariable("id") UUID id, @RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteBeer(@PathVariable("id") UUID id) {
        beerService.deleteBeer(id);
        return ResponseEntity.accepted().build();
    }

}
