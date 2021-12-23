package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entity.Stock;
@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {

}
