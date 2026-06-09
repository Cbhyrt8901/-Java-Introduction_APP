package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.HidaService;
import com.example.demo.service.YamamotoService;

@Controller
public class TeamController {
	@Autowired public YamamotoService yamamotoService;
	@Autowired public HidaService hidaService;
	
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("leaderMsg", "リーダーです！");
		 model.addAttribute("yamamotoMsg", yamamotoService.getProfile());
		 model.addAttribute("hidaMsg", hidaService.getProfile());
        return "index";
    }
}