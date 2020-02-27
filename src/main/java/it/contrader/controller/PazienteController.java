package it.contrader.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.DTO.PazienteDTO;

@RestController
@RequestMapping("/paziente")
@CrossOrigin(origins = "http://localhost:4200")
public class PazienteController extends AbstractController<PazienteDTO> {
	
	

}
