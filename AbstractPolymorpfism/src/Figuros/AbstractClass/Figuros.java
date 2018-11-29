package Figuros.AbstractClass;

import Figuros.Data.Circle;

public abstract class Figuros {

    public double circleArea() {
        double radius, perimeter = Circle.circlePerimeter1();
        radius = perimeter / 2 * Math.PI;
        return Math.PI * (radius * radius);
    }

    public double circlePerimeter() {
        double radius, area = Circle.circleArea1();
        radius = Math.sqrt(area / Math.PI);
        return 2 * Math.PI * radius;
    }


    public int calculateSquare() {
        int Skv, akv;
        akv = 0; //Krastines ilgis.
        Skv = (akv * akv); //Kvadrato plotas.
        return Skv;
    }


    public double calculateEqTriagle() {
        double S, P, p, a, b, c;
        a = 0; //Krastiniu ilgiai.
        b = 0;
        c = 0;
        P = a + b + c; //Perimetras
        p = P / 2; //Pusperimetris
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Trikampio plotas.
        return S;
    }
}
