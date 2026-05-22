import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];
        int suma = 0;
        double promedio;

        // Ingresar números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = entrada.nextInt();

            suma += numeros[i];
        }

        // Calcular promedio
        promedio = (double) suma / numeros.length;

        // Mostrar resultado
        System.out.println("\nEl promedio es: " + promedio);

    }
}