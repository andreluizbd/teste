package br.com.javamagazine.springboot_test;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileSenderController {

	@Autowired
	private FileSenderRepository repository;
	
	@RequestMapping(value="/image", method=RequestMethod.POST)
	public @ResponseBody String salvarImagem(@RequestParam(value="file") MultipartFile file){
		
		try {
			System.out.println(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return file.getName();
		
		//repository.save(file);
		//return null;
	}
	
	@RequestMapping(value="/image", method=RequestMethod.GET)
	public @ResponseBody FileSender buscarImagem(@RequestBody Long id){
		return repository.findOne(id);
	}
	
	
}
