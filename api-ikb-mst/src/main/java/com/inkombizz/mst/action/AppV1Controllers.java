package com.inkombizz.mst.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AppV1Controllers {
	
	@GetMapping("/{page}")
	public String page(@PathVariable String page ) {
		return "<h1>You in v1 Pge </h1> <h1>"+page+"</h1> ";
	}
	
	@GetMapping("/{page}/{fn}")
	public String page_function(@PathVariable String page, @PathVariable String fn ) {
		return "<h1>You in v1 "+page+"</h1> <h1> Function "+fn+"</h1> ";
	}

	@GetMapping("/{page}/{fn}/search")
	public String stringprm_function(@PathVariable String page, @PathVariable String fn , @RequestParam int id) {
		return "<h1>You in v1 "+page+"</h1> <h1> Function "+fn+"</h1> <h1> Search "+id+"</h1> ";
	}
	
}