package dev.Saloncey.miniDocker.controllers;

import dev.Saloncey.miniDocker.entities.Tree;
import dev.Saloncey.miniDocker.exceptions.TreeNotFoundException;
import dev.Saloncey.miniDocker.services.TreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class HomeController {

    private final TreeService treeService;

    @GetMapping("/tree")
    public ResponseEntity<List<Tree>> getTrees(){
        List<Tree> treeList = treeService.findTrees();
        return new ResponseEntity<List<Tree>>(treeList, HttpStatusCode.valueOf(202));
    }

    @GetMapping(value = "/tree/{id}")
    public Tree getTree(@PathVariable(value = "id") Long id){
        Optional<Tree> tree = treeService.findTree(id);
        if (tree.isEmpty())
            throw new TreeNotFoundException("runtime exception");
        return tree.get();
    }

    @DeleteMapping("/tree/{id}")
    public ResponseEntity<String> deleteTree(@PathVariable(value = "id") Long id){
        treeService.deleteTree(id);
        return new ResponseEntity<String>("Deleted tree of id: " + id + " id", HttpStatus.valueOf(200));
    }


    @PostMapping("/tree/new")
    public ResponseEntity<String> newTree(@RequestBody Tree tree){
        treeService.newTree(tree);
        return new ResponseEntity<String>("Tree added succesfully.", HttpStatus.OK);
    }


}
