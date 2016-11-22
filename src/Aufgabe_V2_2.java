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

    public static double bestimmungMin(double ersteZahl, double zweiteZahl, double dritteZahl) {
        double container[] = new double[]{zweiteZahl,dritteZahl};
        double collector = ersteZahl;
        for(int i = 0;i < 1;i++) {
            if(collector <= container[i]) {
                collector = container[i];
            }
        }
        return collector;
    }
}
