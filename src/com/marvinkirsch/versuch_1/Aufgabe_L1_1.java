package com.marvinkirsch.versuch_1;

import java.io.*;

/**
 * Created by Marvin Kirsch on 02.11.2016.
 * Matrikelnr.: 11118687
 */
public class Aufgabe_L1_1 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie c ein:");
        double c = Double.parseDouble(in.readLine());
        double f = 1.8*c+32;
        System.out.println("Temperatur in Fahrenheit: " + f);
        System.out.println("Geben sie eine Temperatur in Fahrenheit an: ");
        f = Double.parseDouble(in.readLine());
        c = (f-32)*5/9;
        System.out.println("Temperatur in Grad Celsius: " + c);
    }
}
