package com.example.finalpro.service.board;

import com.example.finalpro.vo.PagingVO;
import com.example.finalpro.vo.QboardVO;

import java.util.List;

public interface CommonBoardPopularityListService {
    public List<QboardVO> qBoardPopularityList(int subCa, PagingVO pagingVO);
}
