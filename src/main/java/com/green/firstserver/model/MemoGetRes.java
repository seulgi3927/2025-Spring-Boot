package com.green.firstserver.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemoGetRes {
    private int id;
    private String title;
    private String content;
}
