package it.contrader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Paziente {
	
	public enum Stato{
		VIVO,
		MORTO
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Float avanzamento;
	
	private String codiceSanitario;
	
	private Stato stato;
	
	@ManyToOne
	@JoinColumn(name="id_ospedale", referencedColumnName="id")
	private Ospedale ospedale;

}
