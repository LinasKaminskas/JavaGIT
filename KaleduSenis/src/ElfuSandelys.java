public class ElfuSandelys {
    private String zaisloPavadinimas;
    private String kiekis;

    public String getZaisloPavadinimas() {
        return zaisloPavadinimas;
    }

    public void setZaisloPavadinimas(String zaisloPavadinimas) {
        this.zaisloPavadinimas = zaisloPavadinimas;
    }

    public  String getKiekis() {
        return kiekis;
    }

    public void setKiekis(String kiekis) {
        this.kiekis = kiekis;
    }

    @Override
    public String toString() {
        return zaisloPavadinimas + " "  + " " + kiekis;
    }
}
