package com.example.NewSpringProject;

import org.springframework.data.repository.CrudRepository;

public interface NewRepository extends CrudRepository<Customer, Long> {

	Customer save(Customer c1);

}
