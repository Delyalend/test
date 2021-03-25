package com.x5.goodslist.service;

import com.x5.goodslist.dto.RequestGoodDto;
import com.x5.goodslist.model.Good;

import java.util.List;

public interface GoodService {
    List<Good> getGoods(RequestGoodDto requestGoodDto);
}
