package tn.esprit.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.FournisseurRepository;
import tn.esprit.esponline.entity.Fournisseur;

@Service
public class FournisseurService implements IFournisseurService {

	@Autowired
	FournisseurRepository fournisseurRepository;
	
	@Override
	public List<Fournisseur> retrieveAllFournisseurs() {
		List<Fournisseur> fournisseurs = (List<Fournisseur>) fournisseurRepository.findAll();
		return fournisseurs;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur p) {
		// TODO Auto-generated method stub
		return fournisseurRepository.save(p);
	}

	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		// TODO Auto-generated method stub
		return fournisseurRepository.findById(id).get();
	}

}
