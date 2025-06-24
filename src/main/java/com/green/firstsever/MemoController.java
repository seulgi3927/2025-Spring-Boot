package com.green.firstsever;

import com.green.firstsever.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController // 빈(Bean)등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다. 요청/응답 담당자
public class MemoController {

    private final MemoService memoService;
//    public MemoController(MemoService memoService) {
//        this.memoService = memoService;
//    }

    // DI 받는 방법 3가지
    // 1. 필드 주입
    // 2. setter 주입 (메소드 주입)
    // 3. 생성자 주입 , 직접 객체화를 하지 않는다. 외부에서 주입 받는다
    //    이것도 lombok을 통해 해결한다.
    // 1,2번은 잘 사용하지 않는다.

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
