import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] frutas = new String[8];

        // Guardar frutas
        for (int i = 0; i < frutas.length; i++) {

            System.out.print("Ingrese una fruta: ");
            frutas[i] = entrada.nextLine();

        }

        // Mostrar en reversa
        System.out.println("\nFrutas en orden inverso:");

        for (int i = frutas.length - 1; i >= 0; i--) {

            System.out.println(frutas[i]);

        }

    }
}