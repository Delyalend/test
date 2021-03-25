package com.x5.goodslist.dto;

public class DtoDictionary {
    private final Long id;
    private final String search;
    private final Long limit;

    public DtoDictionary(Long id, String search, Long limit) {
        this.id = id;
        this.search = search;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public String getSearch() {
        return search;
    }

    public Long getLimit() {
        return limit;
    }
}
