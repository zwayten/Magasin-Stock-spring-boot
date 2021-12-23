package tn.esprit.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.FactureRepository;
import tn.esprit.esponline.entity.Facture;

@Service
public class FactureService implements IFactureService {

	@Autowired
	FactureRepository factureRepository;
	
	@Override
	public List<Facture> retrieveAllFactures() {
		 List<Facture> factures = (List<Facture>) factureRepository.findAll();
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture f = factureRepository.findById(id).get();
		f.setActive(false);

	}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		return factureRepository.findById(id).get();
	}

}
