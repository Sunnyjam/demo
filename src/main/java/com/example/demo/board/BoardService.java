package com.example.demo.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
     private final BoardMapper boardMapper;

     public int insertBoard(Board board) {
         return boardMapper.insertBoard(board);
     }

     public List<Board> readBoard() {
         return boardMapper.readBoard();
     }

     public int deleteBoard(int id) {
         return boardMapper.deleteBoard(id);
     }

     public int boardUpdate(Board board) {
         return boardMapper.boardUpdate(board);
     }

     public Board readBoardDetail(int id) {
         return boardMapper.readBoardDetail(id);
     }
}
