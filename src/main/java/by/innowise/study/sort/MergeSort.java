package by.innowise.study.sort;

import by.innowise.study.entity.impl.Ball;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort extends Thread {

    private volatile List<Ball> list;
    private List<Ball> left = new ArrayList<>();
    private List<Ball> right = new ArrayList<>();
    private Comparator<Ball> comp;

    public MergeSort(List<Ball> list, Comparator<Ball> comp) {
        this.comp = comp;
        this.list = list;
    }

    public List<Ball> getList() {
        return list;
    }

    public List<Ball> getLeft() {
        return left;
    }

    public List<Ball> getRight() {
        return right;
    }

    public Comparator<Ball> getComp() {
        return comp;
    }

    public void sort() {
        if (this.getList() == null) {
            return;
        }
        if (this.getList().size() == 0) {
            return;
        }
        this.start();
        try {
            this.join();
        } catch (InterruptedException e) {
            System.out.println("Oh bogger, something went wrong: " + e);
        }
    }

    @Override
    public void run() {
        int center;
        if (this.getList().size() != 1) {
            center = this.getList().size() / 2;
            for (int i = 0; i < center; i++) {
                this.getLeft().add(this.getList().get(i));
            }

            for (int i = center; i < this.getList().size(); i++) {
                this.getRight().add(this.getList().get(i));
            }

            MergeSort nextStageLeftThread = new MergeSort(this.getLeft(), this.getComp());
            MergeSort nextStageRightThread = new MergeSort(this.getRight(), this.getComp());

            nextStageLeftThread.start();
            nextStageRightThread.start();
            try {
                nextStageLeftThread.join();
                nextStageRightThread.join();
            } catch (InterruptedException e) {
                System.out.println("Oh bogger, something went wrong: " + e);
            }

            merge(nextStageLeftThread.getList(), nextStageRightThread.getList(), this.getList(), this.getComp());
        }
    }

    private void merge(List<Ball> left, List<Ball> right, List<Ball> list, Comparator<Ball> comp) {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (comp.compare(left.get(leftIndex), right.get(rightIndex)) < 0) {
                list.set(originalIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                list.set(originalIndex, right.get(rightIndex));
                rightIndex++;
            }
            originalIndex++;
        }

        while (leftIndex < left.size()) {
            list.set(originalIndex, left.get(leftIndex));
            originalIndex++;
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            list.set(originalIndex, right.get(rightIndex));
            originalIndex++;
            rightIndex++;
        }
    }
}