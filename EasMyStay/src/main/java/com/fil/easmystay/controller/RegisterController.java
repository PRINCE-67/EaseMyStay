package com.fil.easmystay.controller;

import com.fil.easmystay.models.Customer;
import com.fil.easmystay.models.Owner;
import com.fil.easmystay.service.CustomerService;
import com.fil.easmystay.service.OwnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    private CustomerService customerService;
    private OwnerService ownerService;

    @Autowired
    public RegisterController(CustomerService customerService, OwnerService ownerService) {
        this.customerService = customerService;
        this.ownerService = ownerService;
    }

    @GetMapping("/signup")
    public String showRegistrationPage(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("owner", new Owner());
        return "signup";
    }

    @PostMapping("/signup")
    public String register(Customer customer, Owner owner) {
        if (customer != null) {
            customerService.createCustomer(customer);
        } else if (owner != null) {
            ownerService.createOwner(owner);
        }
        return "redirect:/login"; // Redirect to the login page
    }
}
