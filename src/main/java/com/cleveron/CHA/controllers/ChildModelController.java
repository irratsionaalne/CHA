package com.cleveron.CHA.controllers;

import com.cleveron.CHA.models.ChildModel;
import com.cleveron.CHA.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/childModel")
public class ChildModelController {

    @Autowired
    private ModelService modelService;

    @ModelAttribute
    public ChildModel childModel(){
        return new ChildModel();
    }

    @PostMapping("/add")
    public String addChildModel(ChildModel childModel){
        modelService.createChildModel(childModel);
        return "index";
    }

    @GetMapping("/add")
    public String showChildModelForm() {
        return "childModel/add";
    }
}
