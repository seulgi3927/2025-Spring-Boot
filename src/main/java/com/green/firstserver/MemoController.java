package com.green.firstserver;


import com.green.firstserver.model.MemoGetOneRes;
import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import com.green.firstserver.model.MemoPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor // final이 붙은 애들만 해줌 / 아닌 애들은 안해줌
@RestController // 빈(Bean)등록, 스프링 컨테이너 객체 생성을 대리로 맡긴다. 요청/응답 담당자
public class MemoController {

    private final MemoService memoService;
    // Persistence DB 작업 처리 (로직 + DB 작업 지시)

//    public MemoController(MemoService memoService) {
//        this.memoService = memoService;
//    }

    // DI(Dependency Injection) 받는 방법 3가지
    // 1. 필드 주입
    // 2. setter 주입 (메소드 주입)
    // 3. 생성자 주입 , 직접 객체화를 하지 않는다. 외부에서 주입 받는다
    //    이것도 lombok을 통해 해결한다.
    // 1,2번은 잘 사용하지 않는다.

    @PostMapping("/memo")
    public String postMemo(@RequestBody MemoPostReq req) { //@RequestBody는 JSON 데이터를 받을꺼야.
        System.out.println("postMemo: " + req);
        int result = memoService.insMemo(req);
        return result == 1 ? "성공" : "실패";
    }

    @GetMapping("/memo")
    public List<MemoGetRes> getMemo() {

        return memoService.selMemoList();
    }

    @GetMapping("/memo/{id}")
    public MemoGetOneRes getMemo(@PathVariable int id) {
        System.out.println("getMemo: " + id);
        return memoService.selMemo(id);
    }

    @PutMapping("/memo")
    public String putMemo(@RequestBody MemoPutReq req ) {
        System.out.println("putMemo"+req);
        int result = memoService.updMemo(req);
        return  result == 1 ? "성공" :"실패";
    }

    @DeleteMapping("/memo")
    public String deleteMemo(@RequestParam int id) {
       System.out.println("deleteMemo"+id);
       int result = memoService.delMemo(id);
       return  result == 1 ? "성공" :"실패";
    }


}


