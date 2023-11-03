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
public class LoginController {

    private final CustomerService customerService;
    private final OwnerService ownerService;

    @Autowired
    public LoginController(CustomerService customerService, OwnerService ownerService) {
        this.customerService = customerService;
        this.ownerService = ownerService;
    }

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("customerLoginForm", new Customer());
        model.addAttribute("ownerLoginForm", new Owner());
        return "login";
    }

    @PostMapping("/login")
    public String login(Customer customerLoginForm, Owner ownerLoginForm, Model model) {
        if (customerLoginForm != null) {
            Customer customer = customerService.getCustomerById(customerLoginForm.getCustomerId());
            if (customer != null && customer.getCustomerPassword().equals(customerLoginForm.getCustomerPassword())) {
                // Successful login logic for a customer
            } else {
                model.addAttribute("loginError", true);
            }
        } else if (ownerLoginForm != null) {
            Owner owner = ownerService.getOwnerById(ownerLoginForm.getOwnerId());
            if (owner != null && owner.getOwnerPassword().equals(ownerLoginForm.getOwnerPassword())) {
                // Successful login logic for an owner
            } else {
                model.addAttribute("loginError", true);
            }
        }
        return "redirect:/homepage2";
    }
}
