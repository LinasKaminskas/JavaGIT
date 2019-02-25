package lt.bta.java;

import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Studentas implements Serializable {

    private int id;
    private String vardas;
    private String pavarde;
    private String el_pastas;
    private List<Integer> pazymiai = new ArrayList<>();

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

    public String getEl_pastas() {
        return el_pastas;
    }

    public void setEl_pastas(String el_pastas) {
        this.el_pastas = el_pastas;
    }

    public List<Integer> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Integer> pazymiai) {
        this.pazymiai = pazymiai;
    }

    @Override
    public String toString() {
        return "Studentas{" +
                "id=" + id +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", el_pastas='" + el_pastas + '\'' +
                ", pazymiai=" + pazymiai +
                '}';
    }
}

