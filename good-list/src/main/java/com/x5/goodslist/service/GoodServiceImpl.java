package com.x5.goodslist.service;

import com.x5.goodslist.dto.RequestGoodDto;
import com.x5.goodslist.model.Good;
import com.x5.goodslist.repository.GoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {

    private GoodRepository goodRepository;

    public GoodServiceImpl(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    @Override
    public List<Good> getGoods(RequestGoodDto requestGoodDto) {
        return goodRepository.getGoods(requestGoodDto.getName(),
                requestGoodDto.getValue(),
                requestGoodDto.getPageSize(),
                requestGoodDto.getPageNumber(),
                requestGoodDto.getSearchKey(),
                requestGoodDto.getSearchValue());
    }

}
