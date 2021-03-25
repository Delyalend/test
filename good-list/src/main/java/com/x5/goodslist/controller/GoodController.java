package com.x5.goodslist.controller;

import com.x5.goodslist.dto.GoodDto;
import com.x5.goodslist.dto.RequestGoodDto;
import com.x5.goodslist.enums.Dictionary;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodController {


    @RequestMapping(method = RequestMethod.GET)
    public GoodDto getGoods(@RequestParam @Validated RequestGoodDto requestGoodDto) {
        return null;
    }

    @GetMapping("/dictionaries/{dictionary}")
    public List<?> getDictionary(@PathVariable Dictionary dictionary, @RequestParam String search, @RequestParam(defaultValue = "30") Long limit) {
        return dictionary.dictionaryRepository.getValues(search);
    }

}
