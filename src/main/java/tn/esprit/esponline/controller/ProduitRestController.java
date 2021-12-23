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
import tn.esprit.esponline.entity.Produit;
import tn.esprit.esponline.services.IProduitService;

@Api(tags = "Produit")
@RestController
@RequestMapping("/produit")
public class ProduitRestController {
	@Autowired
	IProduitService produitService;
	
	@ApiOperation(value = "Fetch All Produits")
	@GetMapping("/all")
	@ResponseBody
	public List<Produit> getAllProduits(){
	List<Produit> listProduits = produitService.retrieveAllProduits();
	return listProduits;
	}
	
	
	@ApiOperation(value = "Fetch Produit by ID")
	@GetMapping("/{produit-id}")
	@ResponseBody
	public Produit getProduitById(@PathVariable("produit-id")Long produitId) {
		return produitService.retrieveProduit(produitId);
	}
	
	@ApiOperation(value = "Add a Produit")
	@PostMapping("/add")
	@ResponseBody
	public Produit addProduit(@RequestBody Produit c) {
		Produit produit = produitService.addProduit(c, 1L, 1L);
		return produit;
	}
	
	


}
