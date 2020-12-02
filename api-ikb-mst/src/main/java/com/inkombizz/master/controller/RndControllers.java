package com.inkombizz.master.controller;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inkombizz.master.util.ConvertCurrency;

@RestController
@RequestMapping("/rnd")
public class RndControllers {

	@GetMapping("/terbilang/{numb}")
	public String terbilang(@PathVariable String numb) {
		if (isNumeric(numb)) {
	        
			return "<h1>You Idr "+ConvertCurrency.toFormatIdr(Double.parseDouble(numb))+" Is :</h1> <h4>" + ConvertCurrency.toStringIDR(Long.parseLong(numb)) + " Rupiah</h4> ";
		}else {
			return "<h1>You Idr Is </h1> <h1>Not Valid</h1> ";
		}
	}
	
	public  boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}