import java.io.*;

public class Fehlerprogramm {

    public static void main(String args[]) throws IOException {

        double a, b, c;
        double volumen;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Volumenberechnung für einen Quader");
        System.out.println("Bitte eingeben (in cm, auch Nachkommastellen möglich):");
        System.out.print("Kantenlänge a: ");
        a = Double.parseDouble(in.readLine());
        System.out.print("Kantenlänge b: ");
        b = Double.parseDouble(in.readLine());
        System.out.print("Kantenlänge c: ");
        c = Double.parseDouble(in.readLine());

        volumen = a*b*c;

        System.out.println("\nVolumen: "+volumen+" cm^3 = "+volumen/1000+" Liter");

    }

}