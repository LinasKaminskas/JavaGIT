public class Weather {
    private int howMonth;
    private int timePerMonth;
    private double[] arrayTempSausis;

    public double[] getArrayTempSausis() {
        return arrayTempSausis;
    }

    public int getHowMonth() {
        return howMonth;
    }

    public int getTimePerMonth() {
        return timePerMonth;
    }

    public Weather(int howMonth, int timePerMonth) {
        this.howMonth = howMonth;
        this.timePerMonth = timePerMonth;
    }

    public Weather(double[] arrayTempSausis) {
        this.arrayTempSausis = arrayTempSausis;
    }

    public static double averageWeather(double[] arrayTempSausis) {
        double average;
        double sum = 0;
        double count = 0;
        for (int i = 0; i < arrayTempSausis.length; i++) {
            sum += arrayTempSausis[i];
            count++;
        }
        average = sum / count;
        return average;
    }
}



