package Kontrolinis.src;

public class Padangos {
    //konteinerine klase
   private int aukstis, plotis, padangosKiekis;

    public int getPadangosKiekis() {
        return padangosKiekis;
    }

    public void setPadangosKiekis(int padangosKiekis) {
        this.padangosKiekis = padangosKiekis;
    }

    private String greicioIndeksas;
    private double kaina;



    public int getAukstis() {
        return aukstis;
    }

    public void setAukstis(int aukstis) {
        this.aukstis = aukstis;
    }

    public int getPlotis(int i) {
        return plotis;
    }

    public void setPlotis(int plotis) {
        this.plotis = plotis;
    }

    public String getGreicioIndeksas() {
        return greicioIndeksas;
    }

    public void setGreicioIndeksas(String greicioIndeksas) {
        this.greicioIndeksas = greicioIndeksas;
    }

    public double getKaina(double v) {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

}


