package by.innowise.study.entity;

import java.util.Date;

public class Ball {
    private int size;
    private int weight;
    private String color;
//    private Date dateManufactured;

    public Ball(int size, int weight, String color) {
        this.size = size;
        this.weight = weight;
        this.color = color;
//        this.dateManufactured = dateManufactured;
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

    //
//    public Date getDateManufactured() {
//        return dateManufactured;
//    }
    public String toString() {
        return (this.getSize() + " " + this.getWeight() + " " + this.getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball that = (Ball) o;
        return size == that.size &&
                weight == that.weight &&
                color.equals(that.color);
    }
}
