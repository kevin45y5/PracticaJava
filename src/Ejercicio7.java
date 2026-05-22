import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        boolean encontrado = false;

        System.out.println("Ingrese 12 valores numéricos para la matriz (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\n--- EVALUANDO PUNTOS DE SILLA ---");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int candidato = matriz[i][j];
                boolean esMinimoFila = true;
                boolean esMaximoColumna = true;

                for (int c = 0; c < 4; c++) {
                    if (matriz[i][c] < candidato) {
                        esMinimoFila = false;
                        break;
                    }
                }

                for (int f = 0; f < 3; f++) {
                    if (matriz[f][j] > candidato) {
                        esMaximoColumna = false;
                        break;
                    }
                }

                if (esMinimoFila && esMaximoColumna) {
                    System.out.println("¡Se encontró un Punto de Silla!");
                    System.out.println("Valor: " + candidato + " en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún punto de silla en la matriz ingresada.");
        }
        entrada.close();
    }
}
