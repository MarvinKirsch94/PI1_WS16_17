package com.marvinkirsch.versuch_4;

import java.io.*;

// HIER EINSETZEN: Klassendefinition fuer die Mensakarte

public class MensakarteTest {

    public static void main(String args[]) throws IOException {

        // HIER EINSETZEN: Deklaration der Objektvariablen fuer eine Mensakarte
        // und Erzeugung eines entsprechenden Objekts mit fest vorgebenen Anfangswerten seiner Attribute
        Mensakarte m1 = new Mensakarte(0, "Marvin Kirsch", false);
        Mensakarte m2 = new Mensakarte();
        Mensakartenverzeichnis mv = new Mensakartenverzeichnis(10);

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
            System.out.println("(7) Guthaben ausreichend essen kaffees");
            System.out.println("(8) Hinzufügen ins Verzeichnis");
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

                case 7:
                    // HIER EINSETZEN: Methodenaufruf
                    System.out.println("geben sie den preis des essen an: ");
                    double p = Double.parseDouble(in.readLine());
                    System.out.println("geben sie die anzahl ein: ");
                    int a = Integer.parseInt(in.readLine());
                    System.out.println(m1.eseenKaffee(p, a));
                    break;

                case 8:
                    // HIER EINSETZEN: Methodenaufruf mit Ausgabe seines Rückgabewerts auf den Bildschirm
                    System.out.println(mv.hinzufuegen(m1));
                    System.out.println(mv.hinzufuegen(m2));
                    break;
            }

        } while (choice != 0);

    }

}