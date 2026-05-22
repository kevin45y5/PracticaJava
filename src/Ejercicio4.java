import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Por favor, ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextDouble();
        }

        double mayor = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El mayor valor ingresado es: " + mayor);
        System.out.println("El menor valor ingresado es: " + menor);
        entrada.close();
    }
}
