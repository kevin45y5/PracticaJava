import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        System.out.println("Ingrese los nombres de los 9 artículos:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Artículo para posición [" + i + "][" + j + "]: ");
                articulos[i][j] = entrada.next();
            }
        }

        System.out.println("\n--- MATRIZ CON FILAS INVERTIDAS ---");
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + articulos[i][j] + "]\t");
            }
            System.out.println();
        }
        entrada.close();
    }
}
