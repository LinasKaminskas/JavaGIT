
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * HelloWorld
 * Created by valdas on 2018-12-18.
 */
public class Setai {

    public static void main(String[] args) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trikampis trikampis = (Trikampis) o;
        return Double.compare(trikampis.a, a) == 0 &&
                Double.compare(trikampis.b, b) == 0 &&
                Double.compare(trikampis.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}