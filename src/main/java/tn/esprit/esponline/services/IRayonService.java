package tn.esprit.esponline.services;

import java.util.List;

import tn.esprit.esponline.entity.Rayon;



public interface IRayonService {

	List<Rayon> retrieveAllRayons();

	Rayon addRayon(Rayon p);

	Rayon retrieveRayon(Long id);
}
