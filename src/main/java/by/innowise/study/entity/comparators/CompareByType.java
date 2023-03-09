package by.innowise.study.entity.comparators;

import by.innowise.study.entity.impl.Ball;
import by.innowise.study.entity.impl.BallType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CompareByType implements Comparator<Ball> {

    private ArrayList<BallType> typePriority;

    public CompareByType(ArrayList<BallType> typePriority) {
        if (typePriority == null) {
            this.typePriority = typePriority;
        }
        else {
            Set<BallType> colorSet = new LinkedHashSet<>(typePriority);
            typePriority.clear();
            typePriority.addAll(colorSet);
            this.typePriority = typePriority;
        }
        this.typePriority = typePriority;
    }

    @Override
    public int compare(Ball o1, Ball o2) {
        if (typePriority == null) {
            return o1.getType().compareTo(o2.getType());
        }
        if (typePriority.size() == 0) {
            return o1.getType().compareTo(o2.getType());
        }
//        System.out.println(typePriority);
//        return o1.getType().compareTo(o2.getType());
        if (this.typePriority.indexOf(o1.getType()) < this.typePriority.indexOf(o2.getType())) {
            return -1;
        } else if (this.typePriority.indexOf(o1.getType()) == this.typePriority.indexOf(o2.getType())) {
            return 0;
        }

        return 1;
    }
}
