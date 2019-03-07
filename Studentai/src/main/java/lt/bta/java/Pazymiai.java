package lt.bta.java;

import java.time.LocalDate;
import java.util.Objects;

public class Pazymiai {
    private int id;
    private int studentasId;
    private LocalDate data;
    private int pazymys;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentasId() {
        return studentasId;
    }

    public void setStudentasId(int studentasId) {
        this.studentasId = studentasId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getPazymys() {
        return pazymys;
    }

    public void setPazymys(int pazymys) {
        this.pazymys = pazymys;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, studentasId, data, pazymys);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pazymiai pazymiai = (Pazymiai) obj;

        return id == pazymiai.id &&
                studentasId == pazymiai.studentasId &&
                pazymys == pazymiai.pazymys &&
                data.equals(pazymiai.data);
    }

    @Override
    public String toString() { //gal reikejo tik pazymys
        return "Pazymiai{" +
                "id=" + id +
                ", studentasId=" + studentasId +
                ", data=" + data +
                ", pazymys=" + pazymys +
                '}';
    }
}
