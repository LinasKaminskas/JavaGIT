package Figuros.Data;

import AbstractPolymorpfism.src.Figuros.AbstractClass.Figuros;

public class Circle extends Figuros {
    public static double circlePerimeter1() {
        double perimeter = 100;
        return perimeter;
    }

    public static double circleArea1() {
        double area = 100;
        return area;
    }

    @Override
    public double circlePerimeter() {
        return super.circlePerimeter();
    }

    @Override
    public double circleArea() {
        return super.circleArea();
    }
}

