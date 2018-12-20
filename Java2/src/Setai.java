package Java2.src;

import java.lang.reflect.Array;
import java.util.*;

/**
 * HelloWorld
 * Created by valdas on 2018-12-18.
 */
public class Setai {

    public static void main(String[] args) {

        Object object= new Object();
        int hCode;
        hCode=object.hashCode();
        System.out.println(hCode);

        Set<Trikampis> trikampiai = new HashSet<>();

        trikampiai.add(new Trikampis(3, 4, 5));
        trikampiai.add(new Trikampis(3, 3, 3));
        trikampiai.add(new Trikampis(3, 5, 4));

        System.out.println("Viso skirtingu trikampiu " + trikampiai.size());
    }

}

class Trikampis {

    private double a, b, c;

    public Trikampis(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private List<Double> sortTriagle() {
        List<Double> triagleList = Arrays.asList(a, b, c);
        triagleList.sort(Comparator.naturalOrder());
        System.out.println(triagleList);
        return triagleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trikampis trikampis = (Trikampis) o;

        List<Double> t1 = this.sortTriagle();
        List<Double> t2 = trikampis.sortTriagle();

        return Double.compare(t1.get(0), t2.get(0)) == 0 &&
                Double.compare(t1.get(1), t2.get(1)) == 0 &&
                Double.compare(t1.get(2), t2.get(2)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortTriagle());

    }

}