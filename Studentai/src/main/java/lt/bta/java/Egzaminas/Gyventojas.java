package lt.bta.java.Egzaminas;



public class Gyventojas {


    private int id;
    private String vardas;
    private String pavarde;
    private int gimimo_metai;
    private String gatve;
    private String tautybe;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getGimimo_metai() {
        return gimimo_metai;
    }

    public void setGimimo_metai(int gimimo_metai) {
        this.gimimo_metai = gimimo_metai;
    }

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    public String getTautybe() {
        return tautybe;
    }

    public void setTautybe(String tautybe) {
        this.tautybe = tautybe;
    }

    @Override
    public String toString() {
        return  " \n" + id +
                " " + vardas +
                " " + pavarde +
                " " + gimimo_metai +
                " " + gatve +
                " " + tautybe;
    }


}
