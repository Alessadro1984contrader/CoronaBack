package it.contrader.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.contrader.DTO.PazienteDTO;
import it.contrader.model.Paziente;
@Component
public class PazienteConverter extends AbstractConverter<Paziente,PazienteDTO> {
	@Autowired
	private OspedaleConverter ospedaleConverter;
	@Override
	public PazienteDTO toDTO(Paziente paziente) {
		PazienteDTO pazienteDTO = null;
		if (pazienteDTO != null) {
			
			pazienteDTO = new PazienteDTO(paziente.getId(),paziente.getNome(),paziente.getAvanzamento(),paziente.getCodiceSanitario(),paziente.getStato(),ospedaleConverter.toDTO(paziente.getOspedale()));
			
			
		}
			
			return pazienteDTO;
		}
	
	@Override
	public Paziente toEntity(PazienteDTO pazienteDTO) {
		
		Paziente paziente = null;
		
		if (paziente != null) {
			
			paziente = new Paziente(pazienteDTO.getId(),pazienteDTO.getNome(),pazienteDTO.getAvanzamento(),pazienteDTO.getCodiceSanitario(),pazienteDTO.getStato(),ospedaleConverter.toEntity(pazienteDTO.getOspedaleDTO()));
			

			}
		
		
		return paziente;
		}
	}
	
	


