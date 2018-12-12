public class VaikoCharakteristika {
    private String vardas;
    private String pavarde;
    private String arBuvoGeras;

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getArBuvoGeras() {
        return arBuvoGeras;
    }

    public void setArBuvoGeras(String arBuvoGeras) {
        this.arBuvoGeras = arBuvoGeras;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde + " " + arBuvoGeras;
    }

    ;
}
