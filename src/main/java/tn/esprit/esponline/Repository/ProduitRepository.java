package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entity.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
