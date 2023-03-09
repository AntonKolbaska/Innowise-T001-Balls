package by.innowise.study.entity.comparators;

import by.innowise.study.entity.impl.Ball;

import java.util.*;

public class CompareByColor implements Comparator<Ball> {
    private ArrayList<String> colorPriority;

    public CompareByColor(ArrayList<String> colorPriority) {
        if (colorPriority == null) {
            this.colorPriority = colorPriority;
        }
        else {
            Set<String> colorSet = new LinkedHashSet<>(colorPriority);
            colorPriority.clear();
            colorPriority.addAll(colorSet);
            this.colorPriority = colorPriority;
        }
    }

    @Override
    public int compare(Ball o1, Ball o2) {
        if (colorPriority == null) {
            return o1.getColor().compareTo(o2.getColor());
        } else {
            if (colorPriority.size() == 0) {
                return o1.getColor().compareTo(o2.getColor());
            }
            if (this.colorPriority.indexOf(o1.getColor()) < this.colorPriority.indexOf(o2.getColor())) {
                return -1;
            } else if (this.colorPriority.indexOf(o1.getColor()) == this.colorPriority.indexOf(o2.getColor())) {
                return 0;
            }

            return 1;
        }
    }
}
