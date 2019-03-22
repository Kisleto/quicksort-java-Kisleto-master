package com.codecool.quicksort;

import java.util.List;

import static java.util.Collections.swap;

public class QuickSort {

    /**
     * Sorts the given List in place
     * @param toSort the List to sort. Throws an error if its null
     */
    public void sort(List<Integer> toSort)  {
        if(toSort == null) try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        sort(toSort, 0, toSort.size()-1);

    }

}
