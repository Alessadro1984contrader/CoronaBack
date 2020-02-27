package it.contrader.DAO;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Ospedale;

@Repository
@Transactional
public interface OspedaleRepository extends CrudRepository<Ospedale, Long> {

}
