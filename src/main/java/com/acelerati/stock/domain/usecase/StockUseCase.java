package com.acelerati.stock.domain.usecase;

import com.acelerati.stock.domain.model.stock.Stock;
import com.acelerati.stock.infrastructure.drivenadapters.restapi.StockFeignClient;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class StockUseCase {
    private final StockFeignClient feignClient;

    /**
     * filtrar por ID de producto
     * @param idStock id producto
     * @return retorna un producto existente en el stock por Id
     */
    public Stock findStockById(Long idStock){
        return feignClient.findStockById(idStock);
    }

    /**
     * filtrar todos los productos de un stock
     * @return lista todos los productos existentes en un stock
     */
    public List<Stock> getAllStock(){
      /*
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Stock> pageResult = (Page<Stock>) feignClient.getAllStock(paging);
        return pageResult.toList();
        */
        return feignClient.getAllStock();
    }

    /**
     * Filtrar por categoria, marca y precio de venta
     * @param category categoria de producto
     * @param brand marca del producto
     * @param salePrice precio de venta del producto
     * @return lista de productos filtrados categoria, marca y precio de venta
     */
    public List<Stock> findProductsByCategoryAndBranAndSelPrice
    (String category, String brand ,Double salePrice) {
        var listStock = feignClient.getAllStock();
        return listStock.stream()
                .filter(x -> Objects.equals(x.getProduct().getCategory(), category))
                .filter(x -> Objects.equals(x.getProduct().getBrand(), brand))
                .filter(x -> x.getSalePrice().equals(salePrice))
                .collect(Collectors.toList());
    }
}
