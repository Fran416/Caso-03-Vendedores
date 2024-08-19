import java.util.Random;

public class CasoVendedores {
    public static int[][] generarMatriz(int[][] ventasAnuales) {
        Random random = new Random();
        for (int fila = 0; fila<=15;fila++) {
            for (int columna = 0; columna<=12;columna++) {
                int numeroAleatorio = random.nextInt(101);
                ventasAnuales[fila][columna] = numeroAleatorio;
            }
        }
        return ventasAnuales;}

}
