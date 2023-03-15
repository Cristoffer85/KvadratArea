import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Deklarera
        int side;
        int circ;
        int area;

        //Hämta information ifrån användaren om kvadratens sida
        Scanner scanner = (new Scanner(System.in)); // Deklarera en scanner
        System.out.println("Ange kvadratens sida: "); // Fråga användaren om kvadratens sida
        side = scanner.nextInt(); // Läs in kvadratens sida som en int genom scannern

        // Beräkna kvadratens omkrets och area
        circ = side * 4; // Beräkna kvadratens omkrets
        area = side * side; // Beräkna kvadratens area

        // Skriv ut information på sidan
        System.out.println("Kvadratens omkrets är: " + circ);
        System.out.println("Kvadratens area är: " +area);

    }
}
