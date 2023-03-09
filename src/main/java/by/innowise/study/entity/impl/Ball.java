package by.innowise.study.entity.impl;

public abstract class Ball {

    protected int size;
    protected int weight;
    protected String color;
    protected BallType type;

    public Ball(BallType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public BallType getType() { return type; }


    @Override
    public String toString(){
        return "Ball type: " + type + " size: " + size + " weight: " + weight + " color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball that = (Ball) o;
        return size == that.size &&
                weight == that.weight &&
                color.equals(that.color) &&
                type == that.type;
    }

    @Override
    public int hashCode(){
        int hashCode = size;
        hashCode += 23 * weight;
        hashCode += 23 * color.hashCode();
        hashCode += 23 * type.hashCode();
        return  hashCode;
    }
}
