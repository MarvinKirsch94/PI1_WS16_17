import java.io.*;

/**
 * Created by Marvin Kirsch on 08.11.2016.
 * Matrikelnr.: 11118687
 */
public class Aufgabe_V2_2 {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie die erste Zahl ein: ");
        double eZ = Double.parseDouble(in.readLine());
        System.out.println("Geben sie die zweite Zahl ein: ");
        double zZ = Double.parseDouble(in.readLine());
        System.out.println("Geben sie die dritte Zahl ein: ");
        double dZ = Double.parseDouble(in.readLine());
        System.out.println("Die kleinste Zahl ist: " + bestimmungMin(eZ,zZ,dZ));
    }

    private static double bestimmungMin(double ersteZahl, double zweiteZahl, double dritteZahl) {
        return Math.min(Math.min(ersteZahl, zweiteZahl), dritteZahl);
        //return ersteZahl <= zweiteZahl ? ersteZahl <= dritteZahl ? ersteZahl : dritteZahl : zweiteZahl <= dritteZahl ? zweiteZahl : dritteZahl;
    }
}
