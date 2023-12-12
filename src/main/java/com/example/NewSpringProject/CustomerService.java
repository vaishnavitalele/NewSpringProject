package com.example.NewSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {
	
	@Autowired
	private NewRepository newrepo;
	 public CustomerService(NewRepository newrepo ) {
		 this.newrepo=newrepo;
	 }
	
	
	public Customer addAll(@RequestBody Customer customer) {
		Customer c1= new Customer(customer.getCustname(), customer.getCustmobno(), customer.getCustaddress());
		
			return	newrepo.save(c1);
	}
	

}
