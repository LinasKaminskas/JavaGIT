package Java2.src;

import java.util.*;

public class SetaiTree {
    public static void main(String[] args) {

        TreeSet<Trikampis1> trikampiai = new TreeSet<>();
        trikampiai.add(new Trikampis1(3, 4, 5));
        trikampiai.add(new Trikampis1(3, 3, 3));
        trikampiai.add(new Trikampis1(3, 5, 4));



        System.out.println();
    }
}

class Trikampis1 implements Comparable <Trikampis1> {
    private double a, b, c;


    public Trikampis1(double a, double b, double c) {
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
    List<Double> sortTriagle() {
        List<Double> triagleList = Arrays.asList(a, b, c);
        triagleList.sort(Comparator.naturalOrder());
        System.out.println(triagleList);
        return triagleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Java2.src.Trikampis trikampis = (Java2.src.Trikampis) o;

        List<Double> t1 = this.sortTriagle();
        List<Double> t2 = trikampis.sortTriagle();

        return Double.compare(t1.get(0), t2.get(0)) == 0 &&
                Double.compare(t1.get(1), t2.get(1)) == 0 &&
                Double.compare(t1.get(2), t2.get(2)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortTriagle());

//    @Override
//    public int compareTo(Trikampis1 o) {
//        int cmp = Double.compare(this.a, o.a);
//        if (cmp != 0) return cmp;
//        return cmp;
    }

    @Override
    public int compareTo(Trikampis1 o) {
        return 0;
    }
}

