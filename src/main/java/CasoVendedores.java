import java.util.Random;

public class CasoVendedores {
    public static void main(String[] args) {
        int[][] ventasAnuales = new int[15][12];
        rellenarMatriz(ventasAnuales);
        mostrarMatriz(ventasAnuales);
    }
    public static int[][] rellenarMatriz(int[][] ventasAnuales) {
        Random aleatorio = new Random();
        for (int fila = 0; fila<15;fila++) {
            for (int columna = 0; columna<12;columna++) {
                int numeroAleatorio = aleatorio.nextInt(101);
                ventasAnuales[fila][columna] = numeroAleatorio;
            }
        }
        return ventasAnuales;
    }

    public static void mostrarMatriz(int[][] ventasAnuales) {
        for (int fila = 0; fila<15;fila++) {
            for (int columna = 0; columna<12;columna++) {
                System.out.print(ventasAnuales[fila][columna]+"|");
            }
            System.out.println();
        }

    }


}
