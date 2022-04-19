package com.heracomp.study_Java_oop.service;

import com.heracomp.study_Java_oop.logic.JavaSort;
import com.heracomp.study_Java_oop.logic.Sort;

import java.io.StringBufferInputStream;
import java.util.List;

public class SortService {
    
    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("구현체는 : "+ sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}
