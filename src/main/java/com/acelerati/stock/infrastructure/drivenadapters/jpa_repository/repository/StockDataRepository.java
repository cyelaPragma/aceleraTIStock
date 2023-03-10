package com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.repository;

import com.acelerati.stock.infrastructure.drivenadapters.jpa_repository.entity.StockData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDataRepository extends JpaRepository<StockData, Long> {
}
