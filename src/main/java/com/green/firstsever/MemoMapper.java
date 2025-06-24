package com.green.firstsever;

import com.green.firstsever.model.MemoGetRes;
import com.green.firstsever.model.MemoPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
// 인터페이스 implements한 클래스가 만들어지고
// 그 클래스를 객체화하고 그 객체 주소값을 스프링 컨테이너가 들고 있는다.
// 스프링 컨테이너가 객체 주소값을 들고 있을 수 있는건 빈등록이 되었기 때문

@Mapper
public interface MemoMapper {
    // insert, update, delete 작업은 메소드 만들 때 리턴타입 int
    // 메모맵퍼에 적힌 id 이름이랑 같아야한다.
    int insMemo(MemoPostReq req);
    List<MemoGetRes> selMemolist();

}
