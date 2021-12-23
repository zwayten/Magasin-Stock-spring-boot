package tn.esprit.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.StockRepository;
import tn.esprit.esponline.entity.Stock;

@Service
public class StockService implements IStockService {

	@Autowired
	StockRepository stockRepository;
	
	@Override
	public List<Stock> retrieveAllStocks() {
		List<Stock> stocks = (List<Stock>) stockRepository.findAll();
		return stocks;
	}

	@Override
	public Stock addStock(Stock s) {
		// TODO Auto-generated method stub
		return stockRepository.save(s);
	}

	@Override
	public Stock updateStock(Stock u) {
		// TODO Auto-generated method stub
		return stockRepository.save(u);
	}

	@Override
	public Stock retrieveStock(Long id) {
		// TODO Auto-generated method stub
		return stockRepository.findById(id).get();
	}

}
