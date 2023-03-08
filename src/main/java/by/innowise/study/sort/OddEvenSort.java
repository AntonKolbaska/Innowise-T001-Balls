package by.innowise.study.sort;

import by.innowise.study.entity.Ball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OddEvenSort {

    public void sort(ArrayList<Ball> list, int n, Comparator<Ball> comp)
    {
        boolean isSorted = false; // Initially array is unsorted

        while (!isSorted) {
            isSorted = true;
            Ball temp;

            // Perform Bubble sort on odd indexed element
            for (int i = 1; i <= n - 2; i = i + 2) {
                if (comp.compare(list.get(i), list.get(i+1))==1) {
                    Collections.swap(list, i, i+1);
                    isSorted = false;
                }
            }

            // Perform Bubble sort on even indexed element
            for (int i = 0; i <= n - 2; i = i + 2) {
                if (comp.compare(list.get(i), list.get(i+1))==1) {
                    Collections.swap(list, i, i+1);
                    isSorted = false;
                }
            }
        }

        return;
    }
}
