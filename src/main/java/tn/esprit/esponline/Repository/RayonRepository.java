package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entity.Rayon;

@Repository
public interface RayonRepository extends CrudRepository<Rayon, Long> {

}
