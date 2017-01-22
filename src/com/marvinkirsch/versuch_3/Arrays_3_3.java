package com.marvinkirsch.versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 20.01.2017.
 * Matrikelnr.: 11118687
 */
public class Arrays_3_3 {

    public static void main(String agrs[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Geben sie den naechsten wert fuer a ein: ");
            a[i] = Integer.parseInt(in.readLine());
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println((a[i] == a[i + 1]));
        }
    }
}
