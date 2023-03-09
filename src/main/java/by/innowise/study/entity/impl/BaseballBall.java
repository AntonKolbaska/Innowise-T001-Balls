package by.innowise.study.entity.impl;

public class BaseballBall extends Ball{
    public BaseballBall(int size, int weight, String color) {
        super(BallType.BASEBALL);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Baseball ball: size: " + size + " weight: " + weight + " color: " + color;
    }

}
