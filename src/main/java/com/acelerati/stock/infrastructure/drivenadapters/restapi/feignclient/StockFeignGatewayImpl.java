package com.acelerati.stock.infrastructure.drivenadapters.restapi.feignclient;

import com.acelerati.stock.domain.model.gateways.StockGateway;
import com.acelerati.stock.domain.model.stock.Stock;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StockFeignGatewayImpl implements StockGateway {
    private final StockFeignClient feignClient;
    @Override
    public Page<Stock> getAllStock(Pageable pageable) {
        List<Stock> stockList = feignClient.getAllStock();
        int start = (int) pageable.getOffset();
        int end = Math.min(start+pageable.getPageSize(),stockList.size());
        List<Stock> subList = start>=end?new ArrayList<>():stockList.subList(start,end);
        return new PageImpl<>(subList,pageable,stockList.size());
    }
    @Override
    public Stock findStockById(Long idStock) {
        return feignClient.findStockById(idStock);
    }
}
