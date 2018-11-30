package KlasesObjektai.src;

import java.util.Arrays;

public class WeatherTest {
    public static void main(String[] args) {
        Weather monthTime = new Weather(3, 6);
        System.out.println("Buvo matuojama  " + monthTime.getHowMonth() + "  menesius,  " + monthTime.getTimePerMonth() + "  kartus per menesi.");
        Weather tempSausis = new Weather(new double[]{-11.5, -10.3, -12, -6.5, -5, -15.5});
        System.out.println("Temperatura sausio menesi:  " + Arrays.toString(tempSausis.getArrayTempSausis()));
        System.out.println();

    }
}
