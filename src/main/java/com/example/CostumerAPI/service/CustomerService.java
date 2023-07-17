package com.example.CostumerAPI.service;

import com.example.CostumerAPI.po.Customer;
import com.example.CostumerAPI.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository custRepo;

    public List<Customer> getAll(){
        return custRepo.getAll();
    }

    public Customer getCustomer(int custID){
        return custRepo.getCustomer(custID);
    }

    public String save(Customer cust){
        return custRepo.save(cust);
    }

    public String update(Customer cust){
        return custRepo.update(cust);
    }

    public String delete(int custID){
        return custRepo.delete(custID);
    }
}
