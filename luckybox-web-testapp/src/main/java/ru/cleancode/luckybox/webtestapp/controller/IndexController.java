package ru.cleancode.luckybox.webtestapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
@SuppressWarnings("UnusedDeclaration")
public class IndexController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String showIndex(final Model model) {
        model.addAttribute("title", "Beautiful world!");
        model.addAttribute("today", LocalDate.now());

        return "index";
    }
}
