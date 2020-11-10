package com.master.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class HomeAction {
	// mvvm
	public HomeAction() {
	}

	// @RequestMapping(value = "/", method=RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		return "<script>alert('Hello World');</script>";
	}

	@GetMapping("/about")
	public String about() {
		return "Created by.....";
	}

	@GetMapping("/product/{brand}")
	public String product(@PathVariable String brand) {
		return "Product " + brand;
	}

	@GetMapping("/products/{brand}/{item}")
	public String product(@PathVariable String brand, @PathVariable String item) {
		return "Product " + item + " with brand " + brand;
	}

	@GetMapping("/produk")
	public String produk(@RequestParam int id) {
		return "Product dengan id " + id;	
	}
	
	@GetMapping("/produk2/{brand}")
	public String produk2(@RequestParam int id) {
		return "Product dengan id " + id;	
	}

}
