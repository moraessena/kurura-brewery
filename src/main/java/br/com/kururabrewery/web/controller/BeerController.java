package br.com.kururabrewery.web.controller;

import br.com.kururabrewery.service.BeerService;
import br.com.kururabrewery.web.model.BeerDto;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity createBeer(@RequestBody BeerDto beerDto) {
        BeerDto savedDto = beerService.createBeer(beerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDto);
    }

}
