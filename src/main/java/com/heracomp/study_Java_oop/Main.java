package com.heracomp.study_Java_oop;

import com.heracomp.study_Java_oop.logic.BubbleSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result] "+sort.sort(Arrays.asList(args)));

    }
}
