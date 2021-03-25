package com.x5.goodslist.repository.dictionary;

import com.x5.goodslist.model.Brand;
import com.x5.goodslist.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BrandDictionaryRepositoryImpl<T> implements DictionaryRepository<T>{

    @Override
    public List<T> getValues(String search) {

        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1L,"APPLE"));
        brands.add(new Brand(2L,"BOSCH"));
        brands.add(new Brand(3L,"Adidas"));
        brands.add(new Brand(4L,"Nike"));
        brands.add(new Brand(5L,"Samsung"));



        return (List<T>) brands.stream()
                .map(Brand::getResponseDictionaryDto)
                .collect(Collectors.toList());
    }

}
