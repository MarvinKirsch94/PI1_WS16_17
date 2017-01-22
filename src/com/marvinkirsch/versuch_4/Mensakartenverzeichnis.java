package com.marvinkirsch.versuch_4;

/**
 * Created by Marvin Kirsch on 20.01.2017.
 * Matrikelnr.: 11118687
 */
public class Mensakartenverzeichnis {

    private Mensakarte mensakarten[];

    public Mensakartenverzeichnis(int g) {
        this.mensakarten = new Mensakarte[g];
    }

    public int hinzufuegen(Mensakarte m) {
        for(int i = 0; i < mensakarten.length; i++) {
            if(mensakarten[i] == null) {
                mensakarten[i] = m;
                return i;
            }
        }
        return -1;
    }
}
