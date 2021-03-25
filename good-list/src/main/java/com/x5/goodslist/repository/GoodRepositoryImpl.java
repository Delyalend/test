package com.x5.goodslist.repository;

import com.x5.goodslist.model.Good;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
public class GoodRepositoryImpl implements GoodRepository {

    @Override
    public List<Good> getGoods(String name, List<String> value, Integer pageSize, Integer pageNumber, String searchKey, String searchValue) {

        //TODO: ВЕРНУТЬ ОБЪЕКТЫ

        return null;
    }

}
