package by.innowise.study.sort;

import by.innowise.study.entity.Ball;
import by.innowise.study.entity.comparators.CompareByColor;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MergeSortTest extends TestCase {

    public void runTest(ArrayList<String> colors, ArrayList resultList, ArrayList expectedList) {
        MergeSort mergeSort = new MergeSort(resultList, new CompareByColor(colors));
        mergeSort.sort();
        assertEquals(resultList, expectedList);
    }

    @Test
    public void testByHyi() {
        ArrayList<String> colors = new ArrayList<>(List.of(
                "yellow",
                "green",
                "black",
                "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(10, 300, "black"),
                new Ball(10, 100, "black"),
                new Ball(25, 700, "auburn")));

        runTest(colors, list, listResult);
    }

    @Test
    public void testByAnotherShit() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(10, 300, "black"),
                new Ball(10, 100, "black"),
                new Ball(25, 700, "auburn")
        ));

        runTest(colors, list, listResult);
    }
}