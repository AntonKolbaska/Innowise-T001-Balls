package by.innowise.study.entity.impl;

public class GolfBall extends Ball{
    public GolfBall(int size, int weight, String color) {
        super(BallType.GOLF);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Golf ball: size: " + size + " weight: " + weight + " color: " + color;
    }
}
