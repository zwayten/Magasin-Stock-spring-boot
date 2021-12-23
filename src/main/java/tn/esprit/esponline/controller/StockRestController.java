package tn.esprit.esponline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.esponline.entity.Stock;
import tn.esprit.esponline.services.IStockService;

@Api(tags = "Stock")
@RestController
@RequestMapping("/stock")
public class StockRestController {
	@Autowired
	IStockService stockService;
	
	@ApiOperation(value = "Fetch All Stocks")
	@GetMapping("/all")
	@ResponseBody
	public List<Stock> getAllStocks(){
	List<Stock> listStocks = stockService.retrieveAllStocks();
	return listStocks;
	}
	
	
	@ApiOperation(value = "Fetch Stock by ID")
	@GetMapping("/{stock-id}")
	@ResponseBody
	public Stock getStockById(@PathVariable("stock-id")Long stockId) {
		return stockService.retrieveStock(stockId);
	}
	
	@ApiOperation(value = "Add a Stock")
	@PostMapping("/add")
	@ResponseBody
	public Stock addStock(@RequestBody Stock s) {
		Stock stock = stockService.addStock(s);
		return stock;
	}
	
	



}
