package com.marvinkirsch.versuch_2;

import java.io.*;

/**
 * Created by Marvin Kirsch on 08.11.2016.
 * Matrikelnr.: 11118687
 */
public class Vorbereitung_Praktikum_V2_1 {
    //Der Anspruchsvolle Teil wurde direkt mit in die Aufgabe übernommen fuer das struktogramm siehe "/res/A2_1_struktogramm"
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean sollLaufen = true;
        while(sollLaufen) {
            int n;
            do {
                System.out.println("Geben sie einen Wert für n ein: ");
                n = Integer.parseInt(in.readLine());
            } while (n < 1);
            int teiler;
            do {
                //0 wegen divide bei 0 error und 1 wegen nicht endender schleife
                System.out.println("Geben sie einen Wert(nicht 0 & nicht 1) für den Teiler von n (n/teiler) ein: ");
                teiler = Integer.parseInt(in.readLine());
            } while (teiler == 0 || teiler == 1);
            int k = 0;
            while (n > 1) {
                n /= teiler;
                k++;
            }
            System.out.println("Der Wert von k ist: " + k);
            System.out.println("Soll die Funktion erneut aufgerufen werden ?(y/n)");
            String antwort = " ";
            while(!(antwort.equalsIgnoreCase("y") || antwort.equalsIgnoreCase("n"))) {
                System.out.println("Geben sie y für Ja oder n für nein ein: ");
                antwort = in.readLine();
                System.out.println(antwort);
            }
            if(antwort.equalsIgnoreCase("y")) {
                System.out.println("Wird neu gestarted!");
                sollLaufen = true;
            } else if(antwort.equalsIgnoreCase("n")) {
                System.out.println("Wuensche einen schoenen Tag :)");
                sollLaufen = false;
            }
        }
    }
}
