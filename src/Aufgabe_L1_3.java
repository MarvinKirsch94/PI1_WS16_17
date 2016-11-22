import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nivri on 02.11.2016.
 */
public class Aufgabe_L1_3 {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geben sie einen Wert für a ein: ");
        int a = Integer.parseInt(in.readLine());
        a = a << 3;
        System.out.println("Wert von a: " + a);
    }
}
