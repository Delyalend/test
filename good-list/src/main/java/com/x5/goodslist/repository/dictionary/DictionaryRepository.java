package com.x5.goodslist.repository.dictionary;

import java.util.List;

public interface DictionaryRepository<T> {
    List<T> getValues(String search);
}
