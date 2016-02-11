package br.com.javamagazine.springboot_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContatoController {

	@Autowired
	private ContatoRepository repository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
		return "Cadastro de Contatos";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.PUT)
	public @ResponseBody Contato insert(@RequestBody Contato contato){
		repository.save(contato);
		return contato;
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<Contato> get(){
		
		List<Contato> result = new ArrayList<Contato>();
		Iterator<Contato> it = repository.findAll().iterator();
		while (it.hasNext()) {
			Contato c = it.next();
			result.add(c);
		}

		return result;
	}
	
	
}
