package fr.univ.rouen.stbserver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.univ.rouen.stbserver.DAO.STBRepository;
import fr.univ.rouen.stbserver.exceptions.ErrorResponse;
import fr.univ.rouen.stbserver.exceptions.IdFoundException;
import fr.univ.rouen.stbserver.exceptions.IdNotFoundException;
import fr.univ.rouen.stbserver.model.STB;
import fr.univ.rouen.stbserver.model.STBList;
import fr.univ.rouen.stbserver.model.StbSearch;


@RestController
public class GETController {

	@Autowired
	private STBRepository stbRepository;

	@GetMapping("/id")
	public String getSTBinXML(@RequestParam(value = "name") String texte) {
		return "Détail de la STB demandée" + texte;
	}

	@GetMapping("/test")
	public String getInfoStb(@RequestParam(value = "nb") int id, @RequestParam(value = "texte") String titre) {
		return "<div>Test:</div> <p>id=" + id + "</p> <p>titre=" + titre + "</p>";

	}

	@GetMapping(value = "/stb", produces = MediaType.APPLICATION_XML_VALUE)
	public STB getInfoStb(@RequestParam(value = "id") int id) throws IdNotFoundException{
		STB stb=new STB();
		if(stbRepository.findById(id)==null) {
			String m=String.valueOf(id);
			throw new IdNotFoundException(m);
		}else {
			stb=stbRepository.findById(id);
			return stb;
		}
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex){
		ErrorResponse error = new ErrorResponse();
		String Message=ex.getMessage();
		int id =Integer.parseInt(Message);
		error.setId(id);
		error.setStatus("ERROR");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
  

	@GetMapping(value = "/resume", produces = "application/xml")
	public STBList showAllSttb() {
		STBList stbs = new STBList();
		stbs.setSTB(stbRepository.findAll());
		return stbs;

	}
	@GetMapping(value = "/resume2", produces = "application/xml")
	public List<StbSearch> showAllSttb2() {
		List<StbSearch> stbs;
		stbs=stbRepository.findAllProjectedBy();
		return stbs;
	}
	@DeleteMapping(value = "/delete")
	public String  deleteStb(@RequestParam(value = "id") Integer id) throws IdNotFoundException, IdFoundException {
		STB stb=new STB();
		String m=String.valueOf(id);
		if(stbRepository.findById(id)==null) {
			throw new IdNotFoundException(m);
		}else {
			stb=stbRepository.findById(id);
			stbRepository.delete(stb);
			throw new IdFoundException(m);
		}
		
	}
	@ExceptionHandler(IdFoundException.class)
	public ResponseEntity<ErrorResponse> exceptionHandler2(Exception ex){
		ErrorResponse error = new ErrorResponse();
		String Message=ex.getMessage();
		int id =Integer.parseInt(Message);
		error.setId(id);
		error.setStatus("DELETED");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}
}