import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int op;
        int n1, n2;
        Scanner entrada = new Scanner(System.in);

        while (true) {
            op = entrada.nextInt();
            if (op == 6) {
                break;
            }

            if (op < 1 || op > 6) {
                System.out.println("OPÇÃO INVÁLIDA");
                continue;
            }

            n1 = entrada.nextInt();
            n2 = entrada.nextInt();

            switch (op) {
                case 1:
                    // Potência
                    System.out.printf("Potência = %.1f\n", (double) (Math.pow(n1, n2)));
                    break;
                case 2:
                    // Raiz Quadrada

                    double raiz1 = Math.sqrt(n1);
                    double raiz2 = Math.sqrt(n2);

                    if (raiz1 == (int) raiz1) {
                        System.out.printf("Raiz Quadrada de %.1f = %.1f\n", (double) n1, raiz1); // Exibe com 1 casa
                                                                                                 // decimal
                    } else {
                        System.out.printf("Raiz Quadrada de %.1f = %.16f\n", (double) n1, raiz1); // Exibe com todas as
                                                                                                  // casas decimais
                    }

                    if (raiz2 == (int) raiz2) {
                        System.out.printf("Raiz Quadrada de %.1f = ", (double) n2, raiz2); // Exibe com 1 casa
                                                                                           // decimal
                    } else {
                        System.out.printf("Raiz Quadrada de %.1f = %.16f\n", (double) n2, raiz2); // Exibe com todas as
                                                                                                  // casas decimais
                    }
                    break;
                case 3:
                    // Máximo
                    System.out.printf("Máximo = %.1f\n", (double) (Math.max(n1, n2)));
                    break;
                case 4:
                    // Mínimo
                    System.out.printf("Mínimo = %.1f\n", (double) (Math.min(n1, n2)));
                    break;
                case 5:
                    // Média Geométrica
                    double mediaGeo = Math.sqrt(n1 * n2);
                    if (mediaGeo == (int) mediaGeo) {
                        System.out.printf("Média Geométrica = %.1f\n", (double) Math.sqrt(n1 * n2));
                    } else {
                        System.out.printf("Média Geométrica = %.16f\n", (double) Math.sqrt(n1 * n2));
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        entrada.close();

    }

}