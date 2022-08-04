package com.example.ISMS_Demo.controller;

import com.example.ISMS_Demo.entity.Designation;
import com.example.ISMS_Demo.entity.Division;
import com.example.ISMS_Demo.entity.ISMSUser;
//import com.example.ISMS_Demo.repository.DivisionRepository;
import com.example.ISMS_Demo.repository.DivisionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    DivisionRepository divisionRepository ;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String viewSignUpForm(Model model) {
        model.addAttribute("user", new ISMSUser());
        return "signUp";
    }
    @PostMapping("/register")
    public String submitSignUpForm(Model model, @ModelAttribute("user") ISMSUser user) {
        model.addAttribute("user", new ISMSUser());
        return "signUp";
    }

    @ModelAttribute("designation")
    public List<Designation> getDesignation()
    {
        List<Designation> list = new ArrayList<Designation>();
        list.add(new Designation("Select Designation", 0));
        list.add(new Designation("Commissioner", 1));
        list.add(new Designation("Additional Commissioner", 2));
        list.add(new Designation("Join Commissioner", 3));
        list.add(new Designation("Deputy Commissioner", 4));
        list.add(new Designation("Additional Deputy Commissioner", 5));
        list.add(new Designation("Assistant Commissioner", 6));
        list.add(new Designation("Sub-Inspector", 7));
        list.add(new Designation("Assistant Sub-Inspector", 8));
        list.add(new Designation("Constable", 9));

        return list;

    }

    @GetMapping("division")
    public List<Division> getDivision()
    {
        return divisionRepository.findAllByDivisionId(Integer division_id);
    }

}
