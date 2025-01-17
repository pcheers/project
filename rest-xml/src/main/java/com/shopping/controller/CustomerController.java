package com.shopping.controller;

import com.shopping.vo.Customer;
import com.shopping.vo.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public @ResponseBody Customer getCustomer(@PathVariable("id") long id){
        Customer cust = new Customer("Raja", "Saggurthi", "RedBud Ln", "Kennett Square", "PA", "19810");
        Item item = new Item("Laptop", new BigDecimal("1349.50"), 1);

        cust.setItem(item);

        return cust;
    }
}
