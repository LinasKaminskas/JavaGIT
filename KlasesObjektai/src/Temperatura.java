package KlasesObjektai.src;

import java.math.BigDecimal;

public class Temperatura {
    double[] sausis = {-11.5, -10.3, -12, -6.5, -5, -15.5};
    double[] vasaris = {-16, -14.5, -11, -10.3, -3.5, 0};
    double[] kovas = {-3, -2.5, 0, 5, 9.5, 11.2};

    double sum = arrayElementsSumS(sausis);

    public double getSum() {
        return sum;
    }

    double sum1 = arrayElementsSumV(vasaris);

    public double getSum1() {
        return sum1;
    }

    double sum2 = arrayElementsSumK(kovas);

    public double getSum2() {
        return sum2;
    }

    public static double arrayElementsSumS(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static double arrayElementsSumV(double[] array) {
        double sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        return sum1;
    }

    private static double arrayElementsSumK(double[] array) {
        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        return sum2;
    }

    public static double sausisAverage(double[] sausis) {
        double sausAverageLenght = sausis.length;
        double average = arrayElementsSumS(sausis) / sausAverageLenght;
        double roundOff = Math.round(average * 100.0) / 100.0;
        return roundOff;
    }

    public static double vasarisAverage(double[] vasaris) {
        double vasarAverageLenght = vasaris.length;
        double average = arrayElementsSumV(vasaris) / vasarAverageLenght;
        double roundOff = Math.round(average * 100.0) / 100.0;
        return roundOff;
    }

    public static double kovasAverage(double[] kovas) {
        double average = arrayElementsSumK(kovas) / kovas.length;
        double roundOff = Math.round(average * 100.0) / 100.0;
        return roundOff;
    }

    public static double bendrasAverage(double[] sausis, double[] vasaris, double[] kovas) {
        double bendrasAverageLenght = sausis.length + vasaris.length + kovas.length;
        double average = (arrayElementsSumK(kovas) + arrayElementsSumS(sausis) + arrayElementsSumV(vasaris)) / bendrasAverageLenght;
        double roundOff = Math.round(average * 100.0) / 100.0;
        return roundOff;
    }
}
