package lista_10_matrizes;

import java.util.Random;
import java.util.Scanner;

public class ex_03 {

    public static int[][] matriza(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int num = random.nextInt(10) + 1;
                a[i][j] = num;
            }
        }
        return a;
    }

    public static int[][] matrizb(int[][] b) {
        Random random = new Random();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                int num = random.nextInt(10) + 1;
                b[i][j] = num;
            }
        }
        return b;
    }

    public static int[][] Soma(int[][] a, int[][] b, int[][] soma) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                soma[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return soma;
    }

    public static int[][] subtracao(int[][] a, int[][] b, int[][] sub) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                sub[i][j] = (a[i][j] - b[i][j]);
            }
        }
        return sub;
    }

    public static int[][] multiplicacao(int[][] a, int[][] b, int[][] mult) {
        int contador = 0;
        int soma = 0;
        int c = 0;
        int cont = 0;
        int m = 0;
        //while serve para repetir amatriz B
        while (contador < b.length) {
            //i = nÃºmero de coluna de B
            for (int i = 0; i < b[0].length; i++) {
                //j = nÃºmero de linhas de B e nÃºmero de colunas de A
                for (int j = 0; j < b.length; j++) {
                    //soma recebe a soma da multiplicaÃ§Ã£o da linha de A pela coluna de B
                    // cada linha de A deve multiplicar todas as colunas de B
                    soma += (a[c][j] * b[j][i]);
                }
                mult[c][i] = soma;
                cont++;
                soma = 0;
                //aumenta a linha de A apÃ³s ter multiplicado a anterior por todas as colunas de B
                //c<a.length-1 serve para parar caso a matriz A esteja na Ãºltima linha 
                //cont garante que que a linha na posiÃ§Ã£o c passe por todas as colunas de A
                if (cont == b[0].length && c < a.length - 1) {
                    c++;
                    cont = 0;
                }
            }
            contador++;
        }
        return mult;
    }

    public static void imprimeMatrizes(int[][] a, int[][] b, int[][] c, char op) {
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            //imprime matriz A
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%2d", a[i][j]);
                System.out.print(" | ");
            }
            if (i == a.length / 2) {
                System.out.print("  " + op + "  ");
            } else {
                System.out.print("     ");
            }
            //imprime matriz B
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%2d", b[i][j]);
                System.out.print(" | ");
            }
            if (i == a.length / 2) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%2d", c[i][j]);
                System.out.print(" | ");
            }
        }
        System.out.println("");

    }

    public static void imprimeMatrizesMult(int[][] a, int[][] b, int[][] c) {
        //imprime matriz A
        System.out.println("matriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%2d", a[i][j]);
                System.out.print(" | ");
            }
            System.out.println("");
        }
        System.out.println("");
        //imprime matriz B
        System.out.println("Matriz B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%2d", b[i][j]);
                System.out.print(" | ");
            }
            System.out.println("");
        }
        System.out.println("matriz resultante de A.B");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%3d", c[i][j]);
                System.out.print(" | ");
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menu = 0;
        do {
            int tamanhoL = 0;
            int tamanhoC = 0;
            int tamanhoLB = 0;
            int tamanhoCB = 0;
            System.out.println("||||CALCULADORA DE MATRIZES||||");
            System.out.println("(1) â€“ somar\n"
                    + "(2) â€“ subtraÃ§Ã£o\n"
                    + "(3) â€“ multiplicaÃ§Ã£o\n"
                    + "(4) â€“ sair");
            menu = ler.nextInt();

            if (menu == 1 || menu == 2) {
                System.out.print("quantidade de linhas da matriz A e da matriz B: ");
                tamanhoL = ler.nextInt();
                tamanhoLB = tamanhoL;
                System.out.print("quantidade de colunas da matriz A e da matriz B: ");
                tamanhoC = ler.nextInt();
                tamanhoCB = tamanhoC;
            }
            if (menu == 3) {
                do {
                    if (tamanhoC != tamanhoLB) {
                        System.out.println("\"o nÃºmero de colunas da matriz A deve ser "
                                + "igual ao nÃºmero de linhas da matriz B.\"\n");
                    }
                    System.out.print("quantidade de linhas da matriz A: ");
                    tamanhoL = ler.nextInt();
                    System.out.print("quantidade de colunas da matriz A: ");
                    tamanhoC = ler.nextInt();
                    System.out.print("quantidade de linhas da matriz B: ");
                    tamanhoLB = ler.nextInt();
                    System.out.print("quantidade de colunas da matriz B: ");
                    tamanhoCB = ler.nextInt();
                } while (tamanhoC != tamanhoLB);
            }
            int[][] a = new int[tamanhoL][tamanhoC];
            int[][] b = new int[tamanhoLB][tamanhoCB];
            int[][] soma = new int[tamanhoL][tamanhoC];
            int[][] mult = new int[tamanhoL][tamanhoCB];
            int[][] sub = new int[tamanhoL][tamanhoC];
            a = matriza(a);
            b = matrizb(b);
            switch (menu) {
                case 1:
                    soma = Soma(a, b, soma);
                    imprimeMatrizes(a, b, soma, '+');

                    break;
                case 2:
                    sub = subtracao(a, b, sub);
                    imprimeMatrizes(a, b, sub, '-');
                    break;
                case 3:
                    mult = multiplicacao(a, b, mult);
                    imprimeMatrizesMult(a, b, mult);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("nÃ£o entendi sua solicitaÃ§Ã£o");

            }
        } while (menu != 4);
    }

}
