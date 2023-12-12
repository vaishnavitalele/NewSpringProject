package com.example.NewSpringProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="customer_data")
public class Customer {
	
	@Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long custid;
	
	
	@NotNull
	@NotBlank
	@Size(min=2, message="Customer name must be 2 characters")
	private String custname;
	
	@NotBlank
	@Size(min=10, message = "Customer mobile number must be 10 numbers")
	private String custmobno;
	
	
	@NotNull
	@NotBlank
	private String custaddress;

	public long getCustid() {
		return custid;
	}

	public void setCustid(long custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustmobno() {
		return custmobno;
	}

	public void setCustmobno(String custmobno) {
		this.custmobno = custmobno;
	}

	public String getCustaddress() {
		return custaddress;
	}

	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	
	public Customer() {
		
	}
	

	public Customer(String custname, String custmobno, String custaddress) {
		super();
		this.custname = custname;
		this.custmobno = custmobno;
		this.custaddress = custaddress;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custmobno=" + custmobno + ", custaddress="
				+ custaddress + "]";
	}
	
	
	
	
	
	

}
