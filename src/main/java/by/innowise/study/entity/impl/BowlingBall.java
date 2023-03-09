package by.innowise.study.entity.impl;

public class BowlingBall extends Ball{
    public BowlingBall(int size, int weight, String color) {
        super(BallType.BOWLING);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Bowling ball: size: " + size + " weight: " + weight + " color: " + color;
    }
}
