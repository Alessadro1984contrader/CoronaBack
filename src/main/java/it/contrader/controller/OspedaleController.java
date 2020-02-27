package it.contrader.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.DTO.OspedaleDTO;


@RestController
@RequestMapping("/ospedale")
@CrossOrigin(origins  = "http://localhost:4200")

public class OspedaleController extends AbstractController<OspedaleDTO> {
	
	

}
