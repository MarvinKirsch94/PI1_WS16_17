package com.marvinkirsch.versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 02.12.2016.
 * Matrikelnr.: 11118687
 */
public class Vorbereitung_Praktikum_V3_2 {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double d[] = new double[6];
        for(int x = 0; x < 6; x++) {
            System.out.println("Geben sie die naechste Zahl ein: ");
            d[x] = Double.parseDouble(in.readLine());
        }
        System.out.println("Das Ergebenis lautet: " + sumArray(d));
    }

    public static double sumArray(double d[]) {
        double re = 0;
        for(int i = 0; i < d.length; i++) {
            re += d[i];
        }
        return re;
    }
}
