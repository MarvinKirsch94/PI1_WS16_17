import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nivri on 02.11.2016.
 */
public class Aufgabe_L1_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        short m,n;
        System.out.println("Geben sie m ein: ");
        m = Short.parseShort(in.readLine());
        System.out.println("Geben sie n ein: ");
        n = Short.parseShort(in.readLine());
        int zwischenergebnis = m - m/n*n;
        System.out.println("erste rechenausgabe für m - m/n*n: " + zwischenergebnis);
        System.out.println("Der ganzzahlige Rest m / n zweite ausgabe: " + m%n);
    }
}
