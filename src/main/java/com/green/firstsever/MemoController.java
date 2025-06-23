package com.green.firstsever;

import com.green.firstsever.model.MemoPostReq;
import org.springframework.web.bind.annotation.*;

@RestController // 빈(Bean)등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다. 요청/응답 담당자
public class MemoController {

    @GetMapping("/memo")
    public String getMemo() {
        return "Hello Board!";
    }

    @GetMapping("/memo/{board_id}")
    public String getMemo(@PathVariable("board_id") int boardId) {
        System.out.println("BoardId: " + boardId);
        return "Hello Board! - boardId: " + boardId;
    }

    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req){ // @RequestBody는 JSON 데이터를 받을꺼야.\
        System.out.println("MemoPostReq: " + req);
        return "Post Board!";
    }

}
