package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.DTO.OspedaleDTO;

import it.contrader.model.Ospedale;


@Component
public class OspedaleConverter extends AbstractConverter<Ospedale,OspedaleDTO>{
	@Override
	public Ospedale toEntity(OspedaleDTO ospedaleDTO) {
		Ospedale ospedale = null;
		if (ospedaleDTO != null) {
			ospedale = new Ospedale(ospedaleDTO.getId(),ospedaleDTO.getNome(),ospedaleDTO.getCittà());			
		}
		return ospedale;

}

@Override
public OspedaleDTO toDTO(Ospedale ospedale) {
	OspedaleDTO ospedaleDTO= null;
	if (ospedale != null) {
		ospedaleDTO = new OspedaleDTO(ospedale.getId(),ospedale.getNome(),ospedale.getCittà());
	}
	return ospedaleDTO;
}












}
