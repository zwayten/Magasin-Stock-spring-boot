package tn.esprit.esponline.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.esponline.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
