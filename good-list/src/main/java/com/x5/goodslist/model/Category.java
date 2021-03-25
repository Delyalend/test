package com.x5.goodslist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.x5.goodslist.dto.ResponseDictionaryDto;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @ManyToMany(mappedBy = "categories")
    @JsonIgnore
    private List<Good> goods;

    public Category(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Category() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public ResponseDictionaryDto getResponseDictionaryDto(){
        return new ResponseDictionaryDto(id,"category", value);
    }
}
