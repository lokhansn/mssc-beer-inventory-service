package com.sgl.mssc.beer.inventory.service.web.mappers;

import com.sgl.mssc.beer.inventory.service.domain.BeerInventory;
import com.sgl.mssc.beer.inventory.service.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
