import java.io.*;

/**
 * Created by Marvin Kirsch on 08.11.2016.
 * Matrikelnr.: 11118687
 */
public class Aufgabe_V2_2_Anspruch {

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie den Wert fuer n ein: ");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Geben sie den Wert fuer pos ein: ");
        byte pos = Byte.parseByte(in.readLine());
        System.out.println("Der binaere Wert an der Stelle " + pos + " ist: " + byteWertAnPos(n, pos));
    }

    public static int byteWertAnPos(int n, byte pos) {
        return (n>>(pos-1))&1;
    }
}
