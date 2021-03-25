package com.x5.goodslist.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.Nullable;
import com.x5.goodslist.enums.Expression;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.List;
import java.util.Set;

public class RequestGoodDto
{
    private final String name;
    private final List<String> value;
    private final Set<Expression> expressions;
    private final Integer pageSize;
    private final Integer pageNumber;
    private final String searchKey;
    private final String searchValue;

    public RequestGoodDto(@JsonProperty("name") String name,
                          @JsonProperty("value") List<String> value,
                          @JsonProperty("expression") Set<Expression> expressions,
                          @JsonProperty(defaultValue = "1", value = "pageSize") Integer pageSize,
                          @JsonProperty(defaultValue = "50", value = "pageNumber") Integer pageNumber,
                          @JsonProperty("searchKey") String searchKey,
                          @JsonProperty("searchValue") String searchValue) {
        this.name = name;
        this.value = value;
        this.expressions = expressions;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.searchKey = searchKey;
        this.searchValue = searchValue;
    }

    public String getName() {
        return name;
    }

    public List<String> getValue() {
        return value;
    }

    public Set<Expression> getExpressions() {
        return expressions;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public String getSearchValue() {
        return searchValue;
    }
}

