package by.innowise.study.sort;

import by.innowise.study.entity.comparators.CompareByType;
import by.innowise.study.entity.impl.*;
import by.innowise.study.entity.comparators.CompareByColor;
import by.innowise.study.entity.comparators.CompareBySize;
import by.innowise.study.entity.comparators.CompareByWeight;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSortTest extends TestCase {

    public void runColorsTest(ArrayList<String> colors, ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSort = new OddEvenSort(resultList, new CompareByColor(colors));
        oddEvenSort.sort();
        assertEquals(resultList, expectedList);
    }

    public void runWeightTest(ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSort = new OddEvenSort(resultList, new CompareByWeight());
        oddEvenSort.sort();
        assertEquals(resultList, expectedList);
    }

    public void runSizeTest(ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSort = new OddEvenSort(resultList, new CompareBySize());
        oddEvenSort.sort();
        assertEquals(resultList, expectedList);
    }

    public void runTypesTest(ArrayList<BallType> types, ArrayList resultList, ArrayList expectedList) {
        OddEvenSort oddEvenSortSort = new OddEvenSort(resultList, new CompareByType(types));
        oddEvenSortSort.sort();
        assertEquals(resultList, expectedList);
    }


    //TYPE COMPARATOR

    @Test
    public void testByTypeNullTypes() {
        ArrayList<BallType> types = null;

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        runTypesTest(types, list, listResult);
    }

    @Test
    public void testByTypeNullList() {
        ArrayList<BallType> types = new ArrayList<>(List.of(BallType.BASEBALL, BallType.BOWLING, BallType.GOLF, BallType.POLO));

        ArrayList<Ball> list = null;

        ArrayList<Ball> listResult = null;

        runTypesTest(types, list, listResult);
    }

    @Test
    public void testByTypeDuplicateType() {
        ArrayList<BallType> types = new ArrayList<>(List.of(BallType.BASEBALL, BallType.BOWLING, BallType.GOLF, BallType.POLO, BallType.BASEBALL));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new BaseballBall(10, 300, "black"),
                new BowlingBall(25, 700, "auburn"),
                new GolfBall(10, 100, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green")));

        runTypesTest(types, list, listResult);
    }

    @Test
    public void testByTypeNormal() {
        ArrayList<BallType> types = new ArrayList<>(List.of(BallType.BASEBALL, BallType.BOWLING, BallType.GOLF, BallType.POLO));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new BaseballBall(10, 300, "black"),
                new BowlingBall(25, 700, "auburn"),
                new GolfBall(10, 100, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green")));

        runTypesTest(types, list, listResult);
    }


    //COLOR COMPARATOR

    @Test
    public void testByColorNullColor() {
        ArrayList<String> colors = null;

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorNullList() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = null;

        ArrayList<Ball> listResult = null;

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorDuplicateColors() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn", "yellow"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new BowlingBall(25, 700, "auburn")));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorNormal() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new GolfBall(10, 100, "black"),
                new BaseballBall(10, 300, "black"),
                new BowlingBall(25, 700, "auburn")));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorExcludeColor() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")
        ));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorZeroPriority() {
        ArrayList<String> colors = new ArrayList<>(List.of());

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")
        ));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorLonesomeList() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black")
        ));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorZeroList() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
        ));

        runColorsTest(colors, list, listResult);
    }

    @Test
    public void testByColorSimilarList() {
        ArrayList<String> colors = new ArrayList<>(List.of("yellow", "green", "black", "auburn"));

        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black")
        ));

        runColorsTest(colors, list, listResult);
    }


    //WEIGHT COMPARATOR

    @Test
    public void testByWeightNullList() {

        ArrayList<Ball> list = null;

        ArrayList<Ball> listResult = null;

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightNormal() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 200, "green"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new BowlingBall(25, 700, "auburn")));

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightLonesomeList() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black")
        ));

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightZeroList() {

        ArrayList<Ball> list = new ArrayList<>(List.of(
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
        ));

        runWeightTest(list, listResult);
    }

    @Test
    public void testByWeightSimilarList() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black")
        ));

        runWeightTest(list, listResult);
    }


    //SIZE COMPARATOR

    @Test
    public void testBySizeNullList() {
        ArrayList<Ball> list = null;

        ArrayList<Ball> listResult = null;

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeNormal() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(15, 300, "yellow"),
                new PoloBall(10, 200, "green"),
                new BowlingBall(25, 700, "auburn")));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new PoloBall(10, 300, "black"),
                new PoloBall(10, 200, "green"),
                new PoloBall(15, 300, "yellow"),
                new BowlingBall(25, 700, "auburn")));

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeLonesomeList() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black")
        ));

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeZeroList() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
        ));

        runSizeTest(list, listResult);
    }

    @Test
    public void testBySizeSimilarList() {
        ArrayList<Ball> list = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black")
        ));

        ArrayList<Ball> listResult = new ArrayList<>(List.of(
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black"),
                new GolfBall(10, 100, "black")
        ));

        runSizeTest(list, listResult);
    }

}