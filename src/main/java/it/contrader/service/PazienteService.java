package it.contrader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.DAO.PazienteRepository;
import it.contrader.DTO.PazienteDTO;

import it.contrader.converter.PazienteConverter;
import it.contrader.model.Paziente;

@Service

public class PazienteService extends AbstractService<Paziente, PazienteDTO> {
	
	@Autowired
	private PazienteConverter converter;
	@Autowired
	private PazienteRepository repository;
	
	public List<PazienteDTO> findAllPazienteByOspedaleId(Long id) {
		return converter.toDTOList(repository.findAllByOspedaleId(id));

}
}
