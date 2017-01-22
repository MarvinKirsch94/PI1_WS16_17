package com.marvinkirsch.versuch_4;

/**
 * Created by Marvin Kirsch on 21.12.2016.
 * Matrikelnr.: 11118687
 */
public class Mensakarte {

    private double guthaben;
    private String besitzer;
    private boolean gesperrt;

    public Mensakarte(){
        this(3.0, "horst", true);
    }

    public Mensakarte(double guthaben, String besitzer, boolean gesperrt) {
        this.guthaben = guthaben;
        this.besitzer = besitzer;
        this.gesperrt = gesperrt;
    }

    public void aufladen(double betrag) {
        if(betrag > 0) {
            this.guthaben += betrag;
        }
    }

    public double getGuthaben() {
        return this.guthaben;
    }

    public boolean kaffeeAbbuchen() {
        if(this.gesperrt || this.guthaben < 1.2) {
            return false;
        }
        this.guthaben -= 1.2;
        return true;
    }

    public boolean essenAbbuchen(double preis) {
        if(this.gesperrt || this.guthaben < preis) {
            return false;
        }
        this.guthaben -= preis;
        return true;
    }

    public int verbleibendeKaffee() {
        return (int)(this.guthaben/1.2);
    }

    public boolean toggleSperre() {
        this.gesperrt = !this.gesperrt;
        return this.gesperrt;
    }

    public boolean eseenKaffee (double epreis , int anzahl) {
        return this.guthaben >= (epreis * anzahl + 1.2 * anzahl);
    }
}
