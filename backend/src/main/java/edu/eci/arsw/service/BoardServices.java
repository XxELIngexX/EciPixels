package edu.eci.arsw.service;

import edu.eci.arsw.model.Board;
import edu.eci.arsw.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class BoardServices {

    @Autowired
    private BoardRepository boardRepository;

    public void addBoard(Board board) {
        boardRepository.save(board);
    }

    public Optional<Board> getBoardById(Integer id) {
        return boardRepository.findById(id);
    }
}
