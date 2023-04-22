package org.example.client;

import org.mohebasketball.dto.CommodityDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommodityClientFallback implements CommodityClient{



    @Override
    public List<CommodityDto> findAllCommodity() {
        return null;
    }

    @Override
    public CommodityDto findCommodityById(int id) {
        return null;
    }
}
