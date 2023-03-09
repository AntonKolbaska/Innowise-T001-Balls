package by.innowise.study.sort;

import by.innowise.study.entity.impl.Ball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OddEvenSort {

    private List<Ball> list;

    private Comparator<Ball> comp;

    public OddEvenSort(List<Ball> list, Comparator<Ball> comp) {
        this.list = list;
        this.comp = comp;
    }

    public void sort() {
        if (list == null) {
            return;
        }
        boolean isSorted = false; // Initially array is unsorted

        while (!isSorted) {
            isSorted = true;
            Ball temp;

            // Perform Bubble sort on odd indexed element
            for (int i = 1; i <= list.size() - 2; i = i + 2) {
                if (comp.compare(list.get(i), list.get(i + 1)) == 1) {
                    Collections.swap(list, i, i + 1);
                    isSorted = false;
                }
            }

            // Perform Bubble sort on even indexed element
            for (int i = 0; i <= list.size() - 2; i = i + 2) {
                if (comp.compare(list.get(i), list.get(i + 1)) == 1) {
                    Collections.swap(list, i, i + 1);
                    isSorted = false;
                }
            }
        }

        return;
    }
}
