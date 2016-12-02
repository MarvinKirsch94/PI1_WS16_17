package com.marvinkirsch.versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 02.12.2016.
 * Matrikelnr.: 11118687
 */
public class Vorbereitung_Praktikum_V3_1 {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int laenge;
        do {
            System.out.println("Geben sie die gewuenschte Array laenge ein: ");
            laenge = Integer.parseInt(in.readLine());
        } while(laenge < 3 || laenge > 8);
        int array[] = new int[laenge];
        for(int i = 0; i < laenge; i++) {
            System.out.println("Geben sie den Wert an der Stelle " + i + " ein: ");
            array[i] = Integer.parseInt(in.readLine());
        }
        int re = 0;
        boolean gefunden = false;
        for(int x = 0; x < laenge - 1; x++) {
            for(int y = x + 1; y < laenge; y++) {
                if(array[x] == array[y]) {
                    re = array[x];
                    gefunden = true;
                    break;
                }
            }
        }
        System.out.println(gefunden ? ("Paar gefunden: " + re) : "Kein Paar gefunden.");
    }
}
