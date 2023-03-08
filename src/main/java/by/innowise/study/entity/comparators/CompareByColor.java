package by.innowise.study.entity.comparators;

import by.innowise.study.entity.Ball;

import java.util.ArrayList;
import java.util.Comparator;

public class CompareByColor implements Comparator<Ball> {
    private ArrayList<String> colorPriority;

    public CompareByColor(ArrayList<String> colorPriority) {
        this.colorPriority = colorPriority;
    }

    @Override
    public int compare(Ball o1, Ball o2) {
        if (colorPriority.size() == 0) {
            return o1.getColor().compareTo(o2.getColor());
        }
        else {

            if (this.colorPriority.indexOf(o1.getColor()) < this.colorPriority.indexOf(o2.getColor())) {
                return -1;
            } else if (this.colorPriority.indexOf(o1.getColor()) == this.colorPriority.indexOf(o2.getColor())) {
                return 0;
            }

            return 1;
        }
    }
}
