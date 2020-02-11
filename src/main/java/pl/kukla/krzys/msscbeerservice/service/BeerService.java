package pl.kukla.krzys.msscbeerservice.service;

import org.springframework.data.domain.PageRequest;
import pl.kukla.krzys.msscbeerservice.web.model.BeerDto;
import pl.kukla.krzys.msscbeerservice.web.model.BeerPagedList;

import java.util.UUID;

/**
 * @author Krzysztof Kukla
 */
public interface BeerService {

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, String beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

}
