package com.Computer.cms.service;

import com.Computer.cms.model.Customer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomerService {
    
    private int customerIdCount=1;
    private List<Customer> customerList=new CopyOnWriteArrayList<>();
    
    public Customer addCustomer(Customer customer){
        customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
        return customer;
    }

    public List<Customer> getCustomers() {
        return customerList;
    }
    public Customer getCustomer(int customerId){
       return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();
    }

    public Customer updateCustomer(int customerId,Customer customer){
         customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId()==customerId){
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });
        return customerList
                .stream()
                .filter(c -> c.getCustomerId()== customerId)
                .findFirst()
                .get();
    }
    public void deleteCustomerId(int customerId){
        customerList
                .stream()
                .forEach(c->{
                    if(c.getCustomerId()==customerId ){
                        customerList.remove(c);
                    }
                });

    }


}
