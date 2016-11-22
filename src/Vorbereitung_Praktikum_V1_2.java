/**
 * Created by Marvin Kirsch, Zarko Prastalo on 19.10.2016.
 * Matrikelnr.: 11118687, 11120741
 * Aufgabenblatt 1 - Eigenständige Vorbereitung
 * Das vorliegende Programm berechnet das arithmetische Mittel der drei Dezimahlzahlen x, y, z (mit Fehler)!
 */
import java.io.*;

public class Vorbereitung_Praktikum_V1_2 {

    public static void main(String args[]) throws IOException {
        int x, y, z;
        double resultat;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bitte Operand x eingeben: ");
        x = Integer.parseInt(in.readLine());
        System.out.println("Bitte Operand y eingeben: ");
        y = Integer.parseInt(in.readLine());
        System.out.println("Bitte Operand z eingeben: ");
        z = Integer.parseInt(in.readLine());

        resultat = (x+y+z)/3;

        System.out.println("Resultat: "+resultat);
        /*
            hierbei ist zu beobachten dass, das keine exakten ergebnisse ausgegeben werden,
            da int keine dezimahlzahlen speichert und den "nach komma teil einfach abschneidet!"
         */
    }
}

