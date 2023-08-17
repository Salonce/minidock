package dev.Saloncey.miniDocker.controllers;

import dev.Saloncey.miniDocker.entities.Tree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/tree")
    public Tree getTree(){
        Tree tree = new Tree();
        tree.setName("oak");
        tree.setYear(1938);
        return tree;
    }
}
