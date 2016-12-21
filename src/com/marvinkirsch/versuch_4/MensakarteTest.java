package com.marvinkirsch.versuch_4;

import java.io.*;

// HIER EINSETZEN: Klassendefinition fuer die Mensakarte

public class MensakarteTest {

    public static void main(String args[]) throws IOException {

        // HIER EINSETZEN: Deklaration der Objektvariablen fuer eine Mensakarte
        // und Erzeugung eines entsprechenden Objekts mit fest vorgebenen Anfangswerten seiner Attribute
        Mensakarte m1 = new Mensakarte(100, "Marvin Kirsch", false);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        boolean erfolg;

        do {

            System.out.println();
            System.out.println("Bitte waehlen:");
            System.out.println("(1) Karte aufladen");
            System.out.println("(2) Guthaben anzeigen");
            System.out.println("(3) Kaffee abbuchen");
            System.out.println("(4) Essen abbuchen");
            System.out.println("(5) Verbleibende Kaffees anzeigen");
            System.out.println("(6) Sperre toggeln");
            System.out.println("(0) Ende");
            choice = Integer.parseInt(in.readLine());
            System.out.println();

            switch (choice) {

                case 1:
                    System.out.print("Aufladebetrag? ");
                    double betrag = Double.parseDouble(in.readLine());
                    // HIER EINSETZEN: Methodenaufruf
                    m1.aufladen(betrag);
                    break;

                case 2:
                    // HIER EINSETZEN: Methodenaufruf mit Ausgabe seines Rückgabewerts auf den Bildschirm
                    System.out.println(m1.getGuthaben());
                    break;

                case 3:
                    // HIER EINSETZEN: Methodenaufruf mit Ausgabe seines Rückgabewerts auf den Bildschirm
                    System.out.println(m1.kaffeeAbbuchen());
                    break;

                case 4:
                    System.out.print("Essenspreis? ");
                    double preis = Double.parseDouble(in.readLine());
                    // HIER EINSETZEN: Methodenaufruf mit Ausgabe seines Rückgabewerts auf den Bildschirm
                    System.out.println(m1.essenAbbuchen(preis));
                    break;

                case 5:
                    // HIER EINSETZEN: Methodenaufruf mit Ausgabe seines Rückgabewerts auf den Bildschirm
                    System.out.println(m1.verbleibendeKaffee());
                    break;

                case 6:
                    // HIER EINSETZEN: Methodenaufruf mit Ausgabe seines Rückgabewerts auf den Bildschirm
                    System.out.println(m1.toggleSperre());
                    break;

            }

        } while (choice!=0);

    }

}