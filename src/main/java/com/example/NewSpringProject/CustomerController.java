package com.example.NewSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
    private final CustomerService custService;
	
	public CustomerController(CustomerService custService) {
		this.custService=custService;
	}
	
	
	
	@PostMapping("/add")
	public ResponseEntity<String>  addAll(@Valid @RequestBody Customer customer, BindingResult bindingresult) {
		if(bindingresult.hasErrors()) {
            return new ResponseEntity<>("Invalid input", HttpStatus.BAD_REQUEST);
		}
		Customer c1=custService.addAll(customer);

		return new ResponseEntity<>("Careated", HttpStatus.CREATED);
		
	}
	
	

}
