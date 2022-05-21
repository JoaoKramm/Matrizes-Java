package lista_10_matrizes;

import java.util.Random;

public class ex_01 {

    public static int[][] preencheMatriz(int[][] m) {
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int aleatorio = random.nextInt(9) + 1;
                m[i][j] = aleatorio;
            }
        }
        return m;
    }

    public static int somaMatriz(int m[][]) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {;
                soma += m[i][j];
            }
        }
        return soma;
    }

    public static int linha3(int[][] m) {
        int soma = 0;
        for (int i = 2; i == 2; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }
        return soma;
    }

    public static int coluna2(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {;
            for (int j = 0; j < m[i].length; j++) {
                if (j == 1) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }

    public static int DPrincipal(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j == i) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }

    public static int dSecundario(int[][] m) {
        int soma = 0;
        int j = (m.length - 1);
        for (int i = 0; i < m.length; i++) {
            soma += m[i][j];
            j--;
        }
        return soma;
    }

    public static void escreveMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" | " + m[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] m = new int[7][7];
        m = preencheMatriz(m);
        escreveMatriz(m);
        System.out.println("a soma de toda a matriz é: " + somaMatriz(m));
        System.out.println("a soma da linha 3 é: " + linha3(m));
        System.out.println("a soma da coluna 2 é: " + coluna2(m));
        System.out.println("a soma da diagonal principal é: " + DPrincipal(m));
        System.out.println("a soma da diagonal secundÃ¡ria é: " + dSecundario(m));
    }

}
