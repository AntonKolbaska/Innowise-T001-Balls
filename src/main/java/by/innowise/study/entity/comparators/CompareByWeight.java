package by.innowise.study.entity.comparators;

import by.innowise.study.entity.impl.Ball;

import java.util.Comparator;

public class CompareByWeight implements Comparator<Ball> {

    @Override
    public int compare(Ball o1, Ball o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        if (o1.getWeight() == o2.getWeight()) {
            return 0;
        }

        return 1;
    }
}
