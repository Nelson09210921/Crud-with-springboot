package com.example.CostumerAPI.controller;

import com.example.CostumerAPI.po.Customer;
import com.example.CostumerAPI.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService custService;

    @GetMapping("/getAll")
    public List<Customer> getAll(){
    return custService.getAll();
    }
    @GetMapping("/getCust")
    public Customer getCustomer(@RequestParam int custID){
        return custService.getCustomer(custID);
    }
    @GetMapping("/save")
    public String save(@RequestBody Customer cust){
        return custService.save(cust);
    }
    @GetMapping("/update")
    public String update(@RequestBody Customer cust){
        return custService.update(cust);
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int custID){
        return custService.delete(custID);
    }
}
