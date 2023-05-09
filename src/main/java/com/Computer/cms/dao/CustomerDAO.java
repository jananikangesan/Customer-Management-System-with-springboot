package com.Computer.cms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Computer.cms.model.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer,Integer> {
    
}
