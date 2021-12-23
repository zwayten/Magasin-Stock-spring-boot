package tn.esprit.esponline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.esponline.entity.Client;
import tn.esprit.esponline.services.IClientServices;

@Api(tags = "Client")
@RestController
@RequestMapping("/client")
public class ClientRestController {

	@Autowired
	IClientServices clientService;
	
	@ApiOperation(value = "Fetch All Clients")
	@GetMapping("/all")
	@ResponseBody
	public List<Client> getAllClients(){
	List<Client> listClients = clientService.retrieveAllClients();
	return listClients;
	}
	
	@ApiOperation(value = "Delete client by ID")
	@DeleteMapping("/delete/{id}")
	@ResponseBody
	public void removeClient(@PathVariable("id")Long id) {
		clientService.deleteClient(id);
	}
	
	@ApiOperation(value = "Fetch Client by ID")
	@GetMapping("/{client-id}")
	@ResponseBody
	public Client getClientById(@PathVariable("client-id")Long clientId) {
		return clientService.retrieveClient(clientId);
	}
	
	@ApiOperation(value = "Add a Client")
	@PostMapping("/add")
	@ResponseBody
	public Client addClient(@RequestBody Client c) {
		Client client = clientService.addClient(c);
		return client;
	}
	
	@ApiOperation(value = "Update Client")
	@PutMapping("/update")
	@ResponseBody
	public Client updateClient(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
	
}
