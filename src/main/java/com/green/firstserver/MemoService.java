package com.green.firstserver;

import com.green.firstserver.model.MemoGetOneRes;
import com.green.firstserver.model.MemoGetRes;
import com.green.firstserver.model.MemoPostReq;
import com.green.firstserver.model.MemoPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //빈등록
@RequiredArgsConstructor
public class MemoService {
    // Persistence DB 작업 처리 (로직 + DB작업 지시)
    // 맵퍼는 작업

    //생성자로 주입받고 싶음.
    private final MemoMapper memoMapper;

    public int insMemo(MemoPostReq req) {
        return memoMapper.insMemo(req);
    }

    public List<MemoGetRes> selMemoList() {
        return memoMapper.selMemoList();
    }

    public MemoGetOneRes selMemo(int id) {
        return memoMapper.selMemo(id);

        }
    public  int updMemo(MemoPutReq req) {
        return memoMapper.updMemo(req);
    }

    public int delMemo(int id) {
        return memoMapper.delMemo(id);
    }



}