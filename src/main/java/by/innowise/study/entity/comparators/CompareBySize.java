package by.innowise.study.entity.comparators;

import by.innowise.study.entity.impl.Ball;

import java.util.Comparator;

public class CompareBySize implements Comparator<Ball> {

    @Override
    public int compare(Ball o1, Ball o2) {
        if (o1.getSize() < o2.getSize()) {
            return -1;
        }

        if (o1.getSize() == o2.getSize()) {
            return 0;
        }

        return 1;
    }
}
