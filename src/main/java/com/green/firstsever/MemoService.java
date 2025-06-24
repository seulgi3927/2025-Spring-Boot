package com.green.firstsever;

import com.green.firstsever.model.MemoGetRes;
import com.green.firstsever.model.MemoPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service // 빈등록
public class MemoService {
    // Persistence DB 작업 처리 (로직 + DB 작업 지시)
    // 맵퍼는 작업

    // 생성자로 주입받고 싶음.
    private final MemoMapper memoMapper;

    public int insMemo(MemoPostReq req) {
        return memoMapper.insMemo(req);
    }

    public List<MemoGetRes> selMemoList() {
        return memoMapper.selMemolist();
    }
}
