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
import tn.esprit.esponline.entity.Fournisseur;
import tn.esprit.esponline.services.IFournisseurService;

@Api(tags = "Fournisseur")
@RestController
@RequestMapping("/fournisseur")
public class FournisseurRestController {
	@Autowired
	IFournisseurService fournisseurService;
	
	@ApiOperation(value = "Fetch All Fournisseurs")
	@GetMapping("/all")
	@ResponseBody
	public List<Fournisseur> getAllFournisseurs(){
	List<Fournisseur> listFournisseurs = fournisseurService.retrieveAllFournisseurs();
	return listFournisseurs;
	}
	
	
	@ApiOperation(value = "Fetch Fournisseur by ID")
	@GetMapping("/{fournisseur-id}")
	@ResponseBody
	public Fournisseur getFournisseurById(@PathVariable("fournisseur-id")Long fournisseurId) {
		return fournisseurService.retrieveFournisseur(fournisseurId);
	}
	
	@ApiOperation(value = "Add a Fournisseur")
	@PostMapping("/add")
	@ResponseBody
	public Fournisseur addFournisseur(@RequestBody Fournisseur c) {
		Fournisseur fournisseur = fournisseurService.addFournisseur(c);
		return fournisseur;
	}
	
	


}
