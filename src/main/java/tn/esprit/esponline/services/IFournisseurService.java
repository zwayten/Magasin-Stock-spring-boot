package tn.esprit.esponline.services;

import java.util.List;

import tn.esprit.esponline.entity.Fournisseur;

public interface IFournisseurService {
	
	List<Fournisseur> retrieveAllFournisseurs();

	Fournisseur addFournisseur(Fournisseur p);

	Fournisseur retrieveFournisseur(Long id);

}
