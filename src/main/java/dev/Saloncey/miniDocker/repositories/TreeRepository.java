package dev.Saloncey.miniDocker.repositories;

import dev.Saloncey.miniDocker.entities.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Long> {

}
