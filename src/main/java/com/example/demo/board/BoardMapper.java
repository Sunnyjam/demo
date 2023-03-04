package com.example.demo.board;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insertBoard(Board board);

    List<Board> readBoard();

    int deleteBoard(int id);

    int boardUpdate(Board board);

    Board readBoardDetail(int id);


}
