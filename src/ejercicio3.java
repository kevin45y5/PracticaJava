import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];

        int pares = 0;
        int impares = 0;

        // Ingresar números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese un número: ");
            numeros[i] = entrada.nextInt();

            // Verificar si es par o impar
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);

    }
}