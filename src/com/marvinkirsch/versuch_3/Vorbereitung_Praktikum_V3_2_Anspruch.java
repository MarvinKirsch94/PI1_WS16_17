package com.marvinkirsch.versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 02.12.2016.
 * Matrikelnr.: 11118687
 */
public class Vorbereitung_Praktikum_V3_2_Anspruch {

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie eine Zahl ein: ");
        int as[] = aufsplitten(Integer.parseInt(in.readLine()));
        System.out.println("Die Zahl aufgesplittet: ");
        for(int e : as) {
            System.out.print(e + "\t");
        }
    }

    public static int[] aufsplitten(int n) {
        int re[] = new int[String.valueOf(n).length()];
        for(int i = 0; i < re.length; i++) {
            re[i] = (int)(n/Math.pow(10,re.length - (i + 1)));
            n %= (int)Math.pow(10,re.length - (i + 1));
        }
        return re;
    }
}
