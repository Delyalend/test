package com.x5.goodslist.enums;

import com.x5.goodslist.repository.dictionary.BrandDictionaryRepositoryImpl;
import com.x5.goodslist.repository.dictionary.CategoryDictionaryRepositoryImpl;
import com.x5.goodslist.repository.dictionary.DictionaryRepository;

public enum Dictionary {
    CATEGORY(new CategoryDictionaryRepositoryImpl<String>()),
    BRAND(new BrandDictionaryRepositoryImpl<>()),
    COUNTRY_MANUFACTURER(null),
    DELIVERY_METHOD(null),
    PAYMENT_METHOD(null),
    SELLER(null),
    GUARANTEE(null),
    RATING(null),
    DELIVERY_COMPANY(null),
    AGE_GROUP(null);


    public DictionaryRepository<?> dictionaryRepository;

    Dictionary(DictionaryRepository<?> dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

}
