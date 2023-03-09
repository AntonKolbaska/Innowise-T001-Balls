package by.innowise.study.entity.impl;

public class PoloBall extends Ball{
    public PoloBall(int size, int weight, String color) {
        super(BallType.POLO);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Polo ball: size: " + size + " weight: " + weight + " color: " + color;
    }
}
