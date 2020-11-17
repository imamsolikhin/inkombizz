package com.master.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping(value="/v1")
public class HomeAction {

	public HomeAction() {

	}

//	@RequestMapping(value="/")
	@GetMapping("/")
	public String index() {

		// untuk return bisa tulis script html
		return "<script>alert('Hello World')</script>";
	}

	@GetMapping("/about")
	public String about() {

		// untuk return bisa tulis script html
		return "<script>alert('Created By ................')</script>";
	}

	@GetMapping("/product/{brand}")
	public String product(@PathVariable String brand) {

		// untuk return bisa tulis script html
		return "Product  " + brand;
	}
	
	@GetMapping("/products/{brand}/{item}")
	public String products(@PathVariable String brand, @PathVariable String item) {

		// untuk return bisa tulis script html
		return "products  " + brand + "with " + item;
	}
	
	@GetMapping("/produk")
	public String products(@RequestParam int  id) {

		// untuk return bisa tulis script html
		return "produk dengan id  " + id ;
	}


}
