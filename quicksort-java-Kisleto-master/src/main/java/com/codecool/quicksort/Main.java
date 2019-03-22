package com.codecool.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(23, 3, 43, 12, 33, 21);
        QuickSort sort = new QuickSort();
        sort.sort(integers);
        System.out.println(integers);
    }

}
