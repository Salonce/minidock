package dev.Saloncey.miniDocker.services;


import dev.Saloncey.miniDocker.entities.Tree;
import dev.Saloncey.miniDocker.repositories.TreeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TreeService {

    private final TreeRepository treeRepository;

    public void deleteTree(Long id){
        treeRepository.deleteById(id);
    }

    public List<Tree> findTrees(){
        return treeRepository.findAll();
    }

    public void newTree(Tree tree){
        System.out.println(tree.getId());

        treeRepository.save(tree);
    }

    public Optional<Tree> findTree(Long id){
        return treeRepository.findById(id);
    }
}
