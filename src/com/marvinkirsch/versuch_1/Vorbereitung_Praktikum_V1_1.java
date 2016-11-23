package com.marvinkirsch.versuch_1;
/**
 * Created by Marvin Kirsch, Zarko Prastalo on 19.10.2016.
 * Matrikelnr.: 11118687, 11120741
 * Aufgabenblatt 1 - Eigenständige Vorbereitung
 * Das vorliegende Programm berechnet das arithmetische Mittel der drei Dezimahlzahlen x, y, z
 */
import java.io.*;

public class Vorbereitung_Praktikum_V1_1 {

    public static void main(String args[]) throws IOException {
        double x, y, z, resultat;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte Operand x eingeben: ");
        x = Double.parseDouble(in.readLine());
        System.out.println("Bitte Operand y eingeben: ");
        y = Double.parseDouble(in.readLine());
        System.out.println("Bitte Operand z eingeben: ");
        z = Double.parseDouble(in.readLine());

        resultat = (x+y+z)/3;

        System.out.println("Resultat: "+resultat);
    }
}
