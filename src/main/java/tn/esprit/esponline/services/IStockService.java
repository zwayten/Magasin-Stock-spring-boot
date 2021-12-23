package tn.esprit.esponline.services;

import java.util.List;

import tn.esprit.esponline.entity.Stock;

public interface IStockService {
	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);

}
