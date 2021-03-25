package com.x5.goodslist.dto;

import java.util.Map;

public class GoodDto {
    private final String code;
    private final Long id;
    private final Map<String,Object> attributes;
    private final Integer pageNumber;
    private final Integer pageCount;
    private final Integer goodsLeft;

    public GoodDto(String code, Long id, Map<String, Object> attributes, Integer pageNumber, Integer pageCount, Integer goodsLeft) {
        this.code = code;
        this.id = id;
        this.attributes = attributes;
        this.pageNumber = pageNumber;
        this.pageCount = pageCount;
        this.goodsLeft = goodsLeft;
    }

    public String getCode() {
        return code;
    }

    public Long getId() {
        return id;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public Integer getGoodsLeft() {
        return goodsLeft;
    }
}
