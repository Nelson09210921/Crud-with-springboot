package com.example.CostumerAPI.repository;

import com.example.CostumerAPI.po.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {

    List<Customer> customer = new ArrayList<Customer>();
    public List<Customer> getAll(){
        return customer;
    }

    public Customer getCustomer(int custID){
        Optional<Customer> cust = customer.stream().filter(x -> x.getCustID() == custID).findAny();
        return cust.get();
    }

    public String save(Customer cust){
        customer.add(cust);
        return "Customer data saved succesfuly";
    }

    public String update(Customer cust){
        customer.stream().filter(x -> x.getCustID() == cust.getCustID()).forEach(e ->{
            e.setCustName(cust.getCustName());
            e.setCustAddress(cust.getCustAddress());
            e.setEmail(cust.getEmail());
        });
        return "Customer updater sucesfully";
    }

    public String delete(int custID){
        Optional<Customer> cust = customer.stream().filter(x -> x.getCustID() == custID).findAny();
        customer.remove(cust.get());
        return "Customer deleted";
    }
}
