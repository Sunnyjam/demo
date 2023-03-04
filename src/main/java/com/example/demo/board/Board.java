package com.example.demo.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {
    private int id;
    private int page;
    private String kind;
    private String keyword;
    private String creatDate;
    private String updateDate;
}
