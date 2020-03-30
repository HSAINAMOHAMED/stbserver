package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.STB;

@RestController
public class GETController {
	@GetMapping("/resume")
	public String getListSTBinXML() {
		return "Envoi de la liste des STB";
	}

	@GetMapping("/id")
	public String getSTBinXML(@RequestParam(value = "name") String texte) {
		return ("Détail de la STB demandée : " + texte);
	}

	@GetMapping("/test")
	public String getTestinXML(@RequestParam(value = "nb") int nb, @RequestParam(value = "texte") String texte) {
		return ("Test : <br /> id = " + nb + "<br /> titre = " + texte);
	}

	@GetMapping(value = "/xml")
	public @ResponseBody String getXML() {
		STB stb = new STB("Test STB", 1, "2020/03/23", "Test JAXB");
		return stb.toString();
	}
}