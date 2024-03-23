package edu.eci.arsw.repository;

import edu.eci.arsw.model.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BoardRepository extends CrudRepository<Board, Integer> {
    List<Board> findById(int id);
}
