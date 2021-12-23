package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {

}
