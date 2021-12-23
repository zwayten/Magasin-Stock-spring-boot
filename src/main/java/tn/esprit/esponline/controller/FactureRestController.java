package tn.esprit.esponline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.esponline.entity.Facture;
import tn.esprit.esponline.services.IFactureService;

@Api(tags = "Facture")
@RestController
@RequestMapping("/facture")
public class FactureRestController {
	@Autowired
	IFactureService factureService;
	
	@ApiOperation(value = "Fetch All Factures")
	@GetMapping("/all")
	@ResponseBody
	public List<Facture> getAllFactures(){
	List<Facture> listFactures = factureService.retrieveAllFactures();
	return listFactures;
	}
	
	
	@ApiOperation(value = "Fetch Facture by ID")
	@GetMapping("/{facture-id}")
	@ResponseBody
	public Facture getFactureById(@PathVariable("facture-id")Long factureId) {
		return factureService.retrieveFacture(factureId);
	}
	
	@ApiOperation(value = "Add a Facture")
	@PutMapping("/cancel/{facture-id}")
	@ResponseBody
	public void cancelFacture(@PathVariable("facture-id")Long factureId) {
		 factureService.cancelFacture(factureId);
	}
	
	


}
