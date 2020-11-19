package com.cleveron.CHA.controllers;

import com.cleveron.CHA.models.RootModel;
import com.cleveron.CHA.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/rootModel")
public class RootModelController {

    @Autowired
    private ModelService modelService;

    @ModelAttribute
    public RootModel rootModel(){
        return new RootModel();
    }

    @PostMapping("/add")
    public String addRootModel(@ModelAttribute("rootModel") RootModel rootModel){
        modelService.createRootModel(rootModel);
        return "index";
    }

/*    @PostMapping("/add")
    public String createRootModel(@ModelAttribute("rootModel") RootModel rootModel,
                              BindingResult result, RedirectAttributes redirectAttributes){

        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("rootModel", rootModel);
            redirectAttributes.addFlashAttribute("message", "Error in creating a Root Model!");
            redirectAttributes.addFlashAttribute("messageType", "error");
            return "rootModel/add";
        }

        modelService.createRootModel(rootModel);
        redirectAttributes.addFlashAttribute("message", "Root Model has been successfully created.");
        redirectAttributes.addFlashAttribute("messageType", "success");
        return "index";
    }*/

    @GetMapping("/add")
    public String showRootModelForm() {
        return "rootModel/add";
    }
}
