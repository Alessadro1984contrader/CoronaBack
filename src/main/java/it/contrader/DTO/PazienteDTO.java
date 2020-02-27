package it.contrader.DTO;

import it.contrader.model.Paziente.Stato;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PazienteDTO {
	
	private Long id;
	
	private String nome;
	
	private Float avanzamento;
	
	private String codiceSanitario;
	
	private Stato stato;
	
	private OspedaleDTO ospedaleDTO;
	

}
