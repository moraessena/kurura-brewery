package br.com.kururabrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private Style beerStyle;
    private Long upc;

    public enum Style {
        LAGER, PILSENER, ALE, STOUT, GOSE, IPA;
    }
}
