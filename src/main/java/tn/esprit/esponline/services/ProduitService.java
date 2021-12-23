package tn.esprit.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.DetailProduitRepository;
import tn.esprit.esponline.Repository.ProduitRepository;
import tn.esprit.esponline.Repository.RayonRepository;
import tn.esprit.esponline.Repository.StockRepository;
import tn.esprit.esponline.entity.DetailProduit;
import tn.esprit.esponline.entity.Produit;
import tn.esprit.esponline.entity.Rayon;
import tn.esprit.esponline.entity.Stock;

@Service
public class ProduitService implements IProduitService {

	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	DetailProduitRepository detailProduitRepository;
	@Autowired
	StockRepository stockRepository;
	@Autowired
	RayonRepository rayonRepository;
	
	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		Stock s = stockRepository.findById(idStock).get();
		Rayon r =rayonRepository.findById(idRayon).get();
		
		
		p.setRayons(r);
		p.setStocks(s);
		
		//DetailProduit d = new DetailProduit(12L,current, "aaaa", CategorieProduit.ALIMENTAIRE);
		DetailProduit d = new DetailProduit();
		detailProduitRepository.save(d);
		
		p.setDetailProduit(d);
		
		return produitRepository.save(p);
	}

	@Override
	public Produit retrieveProduit(Long id) {
		return produitRepository.findById(id).get();
	}

}
