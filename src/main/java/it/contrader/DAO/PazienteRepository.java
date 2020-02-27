package it.contrader.DAO;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Paziente;

@Repository
@Transactional
public interface PazienteRepository extends CrudRepository<Paziente, Long>{

	Iterable<Paziente> findAllByOspedaleId(Long id);

}
