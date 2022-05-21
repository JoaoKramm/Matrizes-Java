package lista_10_matrizes;

import java.util.Random;
import java.util.Scanner;

public class ex_02 {

    public static int[][] preencherMatriz(int[][] mat) {
        Random random = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int num = random.nextInt(50) + 1;
                mat[i][j] = num;
            }
        }
        return mat;
    }

    public static void imprimeMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%2d", mat[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

    public static int[][] transporMatriz(int[][] mat, int[][] matTransposta) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matTransposta[j][i] = mat[i][j];
            }
        }
        return matTransposta;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tamanhol = 0;
        int tamanhoc = 0;
        System.out.print("quantidade de linhas da matriz: ");
        tamanhol = ler.nextInt();
        System.out.print("quantidade de colunas da matriz: ");
        tamanhoc = ler.nextInt();
        int[][] mat = new int[tamanhol][tamanhoc];
        int[][] matTransposta = new int[tamanhoc][tamanhol];
        mat = preencherMatriz(mat);
        System.out.println("Matriz");
        imprimeMatriz(mat);
        System.out.println("");
        matTransposta = transporMatriz(mat, matTransposta);
        System.out.println("Matriz transposta");
        imprimeMatriz(matTransposta);

    }

}
