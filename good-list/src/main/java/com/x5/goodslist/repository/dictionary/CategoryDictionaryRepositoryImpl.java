package com.x5.goodslist.repository.dictionary;

import com.x5.goodslist.dto.ResponseDictionaryDto;
import com.x5.goodslist.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryDictionaryRepositoryImpl<T> implements DictionaryRepository<T>{

    @Override
    public List<T> getValues(String search) {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(6L,"Смартфоны"));
        categories.add(new Category(7L,"Телевизоры"));
        categories.add(new Category(8L,"Ноутбуки"));
        categories.add(new Category(9L,"Одежда"));
        categories.add(new Category(10L,"Обувь"));

        return (List<T>) categories.stream()
                .map(Category::getResponseDictionaryDto)
                .collect(Collectors.toList());
    }
}
