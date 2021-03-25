package com.x5.goodslist.utils;

import com.x5.goodslist.dto.ResponseDictionaryDto;

public class DictionaryMapperUtils {

    public static ResponseDictionaryDto fromDictionary(Long id, String name, Object value) {
        return new ResponseDictionaryDto(id, name, value);
    }

}
