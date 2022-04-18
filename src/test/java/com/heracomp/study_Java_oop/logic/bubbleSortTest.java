package com.heracomp.study_Java_oop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class bubbleSortTest {

    @DisplayName("테스트제목: 버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList(){
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //When
        List<Integer> actual = bubbleSort.sort(List.of(3,2,6,1,26));

        //Then
        assertEquals(List.of(1,2,3,6,26), actual);

    }

}