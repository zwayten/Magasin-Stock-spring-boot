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
import tn.esprit.esponline.entity.Rayon;
import tn.esprit.esponline.services.IRayonService;

@Api(tags = "Rayon")
@RestController
@RequestMapping("/rayon")
public class RayonRestController {
	@Autowired
	IRayonService rayonService;
	
	@ApiOperation(value = "Fetch All Rayons")
	@GetMapping("/all")
	@ResponseBody
	public List<Rayon> getAllRayons(){
	List<Rayon> listRayons = rayonService.retrieveAllRayons();
	return listRayons;
	}
	
	
	@ApiOperation(value = "Fetch Rayon by ID")
	@GetMapping("/{rayon-id}")
	@ResponseBody
	public Rayon getRayonById(@PathVariable("rayon-id")Long rayonId) {
		return rayonService.retrieveRayon(rayonId);
	}
	
	@ApiOperation(value = "Add a Rayon")
	@PostMapping("/add")
	@ResponseBody
	public Rayon addRayon(@RequestBody Rayon c) {
		Rayon rayon = rayonService.addRayon(c);
		return rayon;
	}
	
	


}
