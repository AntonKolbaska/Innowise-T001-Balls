package by.innowise.study.sort;

import by.innowise.study.entity.Ball;
import by.innowise.study.entity.comparators.CompareByColor;
import by.innowise.study.entity.comparators.CompareBySize;
import by.innowise.study.entity.comparators.CompareByWeight;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSortTest extends TestCase {

    public void runColorsTest(ArrayList<String> colors, ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSort = new OddEvenSort();
        oddEvenSort.sort(resultList, resultList.size(), new CompareByColor(colors));
        assertEquals(resultList, expectedList);
    }

    public void runWeightTest(ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSort = new OddEvenSort();
        oddEvenSort.sort(resultList, resultList.size(), new CompareByWeight());
        assertEquals(resultList, expectedList);
    }

    public void runSizeTest(ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSort = new OddEvenSort();
        oddEvenSort.sort(resultList, resultList.size(), new CompareBySize());
        assertEquals(resultList, expectedList);
    }


    //COLOR COMPARATOR
    @Test
    public void testByColorNormalA() {
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
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(25, 700, "auburn")));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorExcludeColor() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(25, 700, "auburn")
        ));

        runColorsTest(colors, list, listResult);
    }


    @Test
    public void testByColorLonesome() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black")
        ));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorZero() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
        ));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorSimilar() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black")
        ));

        runColorsTest(colors, list, listResult);
    }


    //WEIGHT COMPARATOR
    @Test
    public void testByWeightNormal() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 200, "green"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(25, 700, "auburn")));

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightLonesome() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black")
        ));

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightZero() {

        ArrayList<Ball> list = new ArrayList<>(List.of(
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
        ));

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightSimilar() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black")
        ));

        runWeightTest(list, listResult);
    }


    //SIZE COMPARATOR
    @Test
    public void testBySizeNormal() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(15, 300, "yellow"),
                new Ball(10, 200, "green"),
                new Ball(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 300, "black"),
                new Ball(10, 200, "green"),
                new Ball(15, 300, "yellow"),
                new Ball(25, 700, "auburn")));

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeLonesome() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black")
        ));

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeZero() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
        ));

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeSimilar() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black"),
                new Ball(10, 100, "black")
        ));

        runSizeTest(list, listResult);
    }

}