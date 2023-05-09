package com.Computer.cms.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Computer.cms.model.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer> {
   
    @Override 
    List<Customer> findAll();
}
