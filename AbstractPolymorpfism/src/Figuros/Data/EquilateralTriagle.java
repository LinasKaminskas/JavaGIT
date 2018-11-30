package Figuros.Data;

import Figuros.AbstractClass.Figuros;

public class EquilateralTriagle extends Figuros {

    @Override
    public double calculateEqTriagle() {
        double S, P, p, a, b, c, d;
        a = 0; //Krastiniu ilgiai.
        b = 0;
        c = 0;
        P = a + b + c; //Perimetras
        p = P / 2; //Pusperimetris
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Trikampio plotas.
        return S;
    }
}
