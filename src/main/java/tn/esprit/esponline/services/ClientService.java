package tn.esprit.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.ClientRepository;
import tn.esprit.esponline.entity.Client;

@Service
public class ClientService implements IClientServices {
	
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		List<Client> clients = (List<Client>) clientRepository.findAll();
		return clients;
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client c) {
		
		return clientRepository.save(c);
	}

	@Override
	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public Client addClient(Client c) {
		return clientRepository.save(c);
	}

}
