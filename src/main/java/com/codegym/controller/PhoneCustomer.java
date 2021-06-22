package com.codegym.controller;

import com.codegym.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhoneCustomer {
    @GetMapping("/phone")
    public ModelAndView phoneList(){
        ModelAndView modelAndView=new ModelAndView("/list");
        modelAndView.addObject("phones",new Phone());
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView checkPhone(@Validated @ModelAttribute(name = "phones")Phone phone, BindingResult bindingResult){
       if (bindingResult.hasFieldErrors()){
           return new ModelAndView("/list","phones",phone);
       }
       return new ModelAndView("/result");
    }
}
