import java.io.*;

/**
 * Created by Marvin Kirsch on 08.11.2016.
 * Matrikelnr.: 11118687
 */
public class Aufgabe_V2_1 {

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
                System.out.println("Geben sie einen Wert(nicht 0) für den Teiler von n (n/teiler) ein: ");
                teiler = Integer.parseInt(in.readLine());
            } while (teiler == 0);
            int k = 0;
            while (n > 1) {
                n /= teiler;
                k++;
            }
            System.out.println("Der Wert von k ist: " + k);
            System.out.println("Soll die Funktion erneut aufgerufen werden ?(y/n)");
            String antwort = "a";
            while(!(antwort.equalsIgnoreCase("y") || antwort.equalsIgnoreCase("n"))) {
                System.out.println("Geben sie y für Ja ein oder n für nein: ");
                antwort = in.readLine();
                System.out.println(antwort);
            }
            if(antwort.equals("y")) {
                System.out.println("Wird neu gestarted!");
                sollLaufen = true;
            } else if(antwort.equals("n")) {
                System.out.println("Wuensche einen schoenen Tag :)");
                sollLaufen = false;
            }
        }
    }
}
