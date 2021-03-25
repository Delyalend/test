package com.x5.goodslist.repository;

import com.x5.goodslist.model.Good;

import java.util.List;

public interface GoodRepository {
    List<Good> getGoods(String name,
                        List<String> value,
                        Integer pageSize,
                        Integer pageNumber,
                        String searchKey,
                        String searchValue);
}
