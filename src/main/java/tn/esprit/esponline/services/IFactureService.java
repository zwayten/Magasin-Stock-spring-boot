package tn.esprit.esponline.services;

import java.util.List;

import tn.esprit.esponline.entity.Facture;

public interface IFactureService {

	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);
}
