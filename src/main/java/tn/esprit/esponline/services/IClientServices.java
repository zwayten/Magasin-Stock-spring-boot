package tn.esprit.esponline.services;

import java.util.List;

import tn.esprit.esponline.entity.Client;

public interface IClientServices {

	Client addClient(Client c);
	List<Client> retrieveAllClients();
	void deleteClient(Long id);
	Client updateClient(Client c);
	Client retrieveClient(Long id);
}
