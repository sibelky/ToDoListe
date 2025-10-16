package de.htwberlin.webtech.ToDoListe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ToDoListeController {

    @GetMapping(path = "/")
    public ModelAndView showToDoListe() {
        return new ModelAndView("todolist");
    }
}
