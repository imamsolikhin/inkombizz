package com.master.api.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.master.api.dao.UserRepository;
import com.master.api.model.User;
import com.master.api.util.Response;

@RestController
@RequestMapping(value="/v1")
public class UserAction {
		
	@Autowired
	UserRepository repo;
	
	@PostMapping("/")
	public ResponseEntity<Response> add(@RequestBody User model) {  
		try {
			Response r=new Response();
			r.setStatus(true);
			r.setData(model);
			repo.save(model);
			return new ResponseEntity<Response>(r,HttpStatus.OK);
		}
		catch(Exception ex) {
			Response r=new Response();
			r.setStatus(false);
			r.setMessage("An Error has occured");
			return new ResponseEntity<Response>(r,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/")
	public ResponseEntity<Response> all() {  
		try {
			Response r=new Response();
			r.setStatus(true);
			r.setData(repo.findAll());
			return new ResponseEntity<Response>(r,HttpStatus.OK);
		}
		catch(Exception ex) {
			Response r=new Response();
			r.setStatus(false);
			r.setMessage("An Error has occured");
			return new ResponseEntity<Response>(r,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@DeleteMapping("/{code}")
	public ResponseEntity<Response> delete(@PathVariable String code) {  
		try {
			Response r=new Response();
			r.setStatus(true);
			repo.deleteById(code);
			return new ResponseEntity<Response>(r,HttpStatus.OK);
		}
		catch(Exception ex) {
			Response r=new Response();
			r.setStatus(false);
			r.setMessage("An Error has occured");
			return new ResponseEntity<Response>(r,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/")
	public ResponseEntity<Response> update(@RequestBody User model) {  
		try {
			Response r=new Response();
			r.setStatus(true);
			repo.save(model);
			return new ResponseEntity<Response>(r,HttpStatus.OK);
		}
		catch(Exception ex) {
			Response r=new Response();
			r.setStatus(false);
			r.setMessage("An Error has occured");
			return new ResponseEntity<Response>(r,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
}
