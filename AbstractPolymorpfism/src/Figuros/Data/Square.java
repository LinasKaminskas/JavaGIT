package AbstractPolymorpfism.src.Figuros.Data;

import AbstractPolymorpfism.src.Figuros.AbstractClass.Figuros;

public class Square extends Figuros {
    @Override
    public int calculateSquare() {
        int Skv, akv;
        akv = 0; //Krastines ilgis.
        Skv = (akv * akv); //Kvadrato plotas.
        return Skv;
    }
}
