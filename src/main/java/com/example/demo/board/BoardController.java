package com.example.demo.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/insertBoard")
    public int insertBoard(@RequestBody Board board) {
        return boardService.insertBoard(board);
    }
    @GetMapping("/readBoard")
    public List<Board> readBoard() {
        return boardService.readBoard();
    }

    @DeleteMapping("/deleteBoard/{id}")
    public int deleteBoard(@PathVariable int id) {
        return boardService.deleteBoard(id);
    }

    @PutMapping("/boardUpdate")
    public int boardUpdate(@RequestBody Board board) {
        return boardService.boardUpdate(board);
    }

    @GetMapping("/readBoardDetail/{id}")
    public Board readBoardDetail(@PathVariable int id) {
        return boardService.readBoardDetail(id);
    }
}
