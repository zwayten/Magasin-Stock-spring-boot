package tn.esprit.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.esponline.Repository.RayonRepository;
import tn.esprit.esponline.entity.Rayon;

@Service
public class RayonService implements IRayonService {

	@Autowired
	RayonRepository rayonRepository;
	
	@Override
	public List<Rayon> retrieveAllRayons() {
		List<Rayon> rayons = (List<Rayon>) rayonRepository.findAll();
		return rayons;
	}

	@Override
	public Rayon addRayon(Rayon p) {
		return rayonRepository.save(p);
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		return rayonRepository.findById(id).get();
	}

}
