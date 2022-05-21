package lista_10_matrizes;

import java.util.Random;

public class ex_04 {

    public static int[][] matrizG(int[][] g) {
        Random random = new Random();
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                int num = random.nextInt(10) + 1;
                g[i][j] = num;
            }
        }
        return g;
    }

    public static int[] somaLiha(int[][] g, int[] somaL) {
        int soma = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                soma += g[i][j];
            }
            somaL[i] = soma;
            soma = 0;
        }
        return somaL;
    }

    public static int[] somaColuna(int[][] g, int[] somaC) {
        int soma = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                soma += g[j][i];
            }
            somaC[i] = soma;
            soma = 0;
        }
        return somaC;
    }

    public static void escreveMatriz(int[][] g, int[] somaC, int[] somaL) {
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.printf("%2d", g[i][j]);
                System.out.print(" | ");
            }
            System.out.print(" = " + somaL[i]);
            System.out.println("");
        }
        for (int i = 0; i < g.length; i++) {
            System.out.print("||   ");
        }
        System.out.println("");
        for (int i = 0; i < g.length; i++) {
            System.out.printf("%2d", somaC[i]);
            System.out.print("   ");
        }
    }

    public static void main(String[] args) {
        int[][] g = new int[5][5];
        int[] somaL = new int[5];
        int[] somaC = new int[5];
        g = matrizG(g);
        somaL = somaLiha(g, somaL);
        somaC = somaColuna(g, somaC);
        escreveMatriz(g, somaC, somaL);
    }

}
