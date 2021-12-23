package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entity.DetailProduit;

@Repository
public interface DetailProduitRepository extends CrudRepository<DetailProduit, Long> {

}
