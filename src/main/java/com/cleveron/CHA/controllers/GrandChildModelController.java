package com.cleveron.CHA.controllers;

import com.cleveron.CHA.models.GrandChildModel;
import com.cleveron.CHA.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grandChildModel")
public class GrandChildModelController {

    @Autowired
    private ModelService modelService;

    @ModelAttribute
    public GrandChildModel grandChildModel(){
        return new GrandChildModel();
    }

    @PostMapping("/add")
    public String addGrandChildModel(GrandChildModel grandChildModel){
        modelService.createGrandChildModel(grandChildModel);
        return "index";
    }

    @GetMapping("/add")
    public String showGrandChildModelForm() {
        return "grandChildModel/add";
    }
}
