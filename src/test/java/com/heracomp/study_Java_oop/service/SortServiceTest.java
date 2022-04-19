package com.heracomp.study_Java_oop.service;

import com.heracomp.study_Java_oop.logic.JavaSort;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    //입력받는 파라미터에 맞는 Sort가 실행되도록 만듬
    private SortService sort = new SortService(new JavaSort<String>());

    @Test
    void test(){
        //Given

        //When
        List<String> result = sort.doSort(List.of("1","4","2","3"));

        //Then
        assertEquals(List.of("1","2","3","4"), result);
    }

}