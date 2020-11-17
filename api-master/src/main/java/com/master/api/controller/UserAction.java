package com.master.api.controller;

import javax.persistence.PostUpdate;

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

import com.master.api.model.User;
import com.master.api.repository.UserRepository;
import com.master.api.util.Response;

@RestController
@RequestMapping(value = "/v1/user")
public class UserAction {
	@Autowired
	UserRepository repo;

	@PostMapping("/")
	public ResponseEntity<Response> add(@RequestBody User user) {

		try {

			Response r = new Response();
			r.setStatus(true);
			r.setData(user);
			r.setMessage("Succes ew");
			repo.save(user);

			return new ResponseEntity<Response>(r, HttpStatus.OK);

		} catch (Exception ex) {
			Response r = new Response();
			r.setStatus(false);
			r.setMessage("An Error Has Occured eew");
			return new ResponseEntity<Response>(r, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	@GetMapping("/")
	public ResponseEntity<Response> getAll() {
		try {

			Response r = new Response();
			r.setStatus(true);
			r.setData(repo.findAll());
			r.setMessage("Succes get all ew");
			return new ResponseEntity<Response>(r, HttpStatus.OK);

		} catch (Exception ex) {
			Response r = new Response();
			r.setStatus(false);
			r.setMessage("An Error Has Occured get all eew");
			return new ResponseEntity<Response>(r, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@PutMapping("/{code}")
	public ResponseEntity<Response> UpdateById(@RequestBody User user,@PathVariable String code) {

		try {

			Response r = new Response();
			r.setStatus(true);
			
			User m = repo.findById(code).get();
			m.setUsername(user.getUsername());
			m.setPassword(user.getPassword());
			m.setRolecode(user.getRolecode());

			r.setMessage("Succes update ew");
			r.setData(user);
			return new ResponseEntity<Response>(r, HttpStatus.OK);

		} catch (Exception ex) {
			Response r = new Response();
			r.setStatus(false);
			r.setMessage("An Error Has Occured delete eew");
			return new ResponseEntity<Response>(r, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@PutMapping("/")
	public ResponseEntity<Response> UpdateAll(@RequestBody User user) {

		try {

			Response r = new Response();
			r.setStatus(true);

//			User m = repo.findById(code).get();
//			m.setUsername(user.getUsername());
//			m.setPassword(user.getPassword());
//			m.setRolecode(user.getRolecode());
			repo.save(user);
			r.setMessage("Succes update ew");
			r.setData(user);
			return new ResponseEntity<Response>(r, HttpStatus.OK);

		} catch (Exception ex) {
			Response r = new Response();
			r.setStatus(false);
			r.setMessage("An Error Has Occured delete eew");
			return new ResponseEntity<Response>(r, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	@DeleteMapping("/{code}")
	public ResponseEntity<Response> Delete(@PathVariable String code) {

		try {

			Response r = new Response();
			r.setStatus(true);
			repo.deleteById(code);
			r.setMessage("Succes delete ew");
			return new ResponseEntity<Response>(r, HttpStatus.OK);

		} catch (Exception ex) {
			Response r = new Response();
			r.setStatus(false);
			r.setMessage("An Error Has Occured delete eew");
			return new ResponseEntity<Response>(r, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
}
