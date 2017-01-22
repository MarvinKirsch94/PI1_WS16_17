package com.marvinkirsch.versuch_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Marvin Kirsch on 20.01.2017.
 * Matrikelnr.: 11118687
 */
public class Arrays {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        int b[] = new int[5];
        boolean c[] = new boolean[5];
        for(int i = 0; i < 5; i++) {
            System.out.println("Geben sie den naechsten  wert fuer a ein: ");
            a[i] = Integer.parseInt(in.readLine());
        }
        for(int i = 0; i < 5; i++) {
            System.out.println("Geben sie den naechsten  wert fuer b ein: ");
            b[i] = Integer.parseInt(in.readLine());
        }
        System.out.println(arrays(a, b, c));
        for (int i=0;i < a.length;i++) {
            System.out.print(a[i] + "\t" + b[i] + "\t" + c[i] + "\n");
        }
    }

    private static boolean arrays(int a[], int b[], boolean c[]) {
        if(a.length != b.length) return false;
        for(int i = 0; i < 5; i++) {
            c[i] = a[i] == b[i];
        }
        return true;
    }


}
