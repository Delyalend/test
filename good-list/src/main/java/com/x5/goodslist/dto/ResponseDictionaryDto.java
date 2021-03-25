package com.x5.goodslist.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDictionaryDto {
    private final Long id;
    private final String name;
    private final Object value;

    @JsonCreator
    public ResponseDictionaryDto(@JsonProperty("id") Long id,
                                 @JsonProperty("name") String name,
                                 @JsonProperty("value") Object value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
