import java.util.Scanner;

/*Você foi contratado para desenvolver uma aplicação que analise um conjunto fixo de dados inteiros, incluindo números positivos e negativos. Seu programa deve:

Inserir elementos: Permitir ao usuário adicionar até 10 números inteiros (positivos ou negativos).
Calcular a soma dos elementos: Calcular e exibir a soma de todos os números inseridos.
Encontrar o maior valor: Determinar e exibir o maior valor presente no vetor.
Encontrar o menor valor: Determinar e exibir o menor valor presente no vetor.
Calcular a média dos elementos: Calcular e exibir a média dos números inseridos. */

public class Main {
    private static final int TAMANHO = 10;
    private static int[] vetor = new int[TAMANHO];
    private static int count = 0;

    static void adicionarElemento(int elemento) {
        vetor[count] = elemento;
    }

    static int calcularSoma() {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma;
    }

    static int encontrarMaior() {
        int valor = vetor[0];
        for (int num : vetor) {
            if (num > valor) {
                valor = num;
            }
        }
        return valor;
    }

    static int encontrarMenor() {
        int valor = vetor[0];
        for (int num : vetor) {
            if (num < valor) {
                valor = num;
            }
        }
        return valor;
    }

    static double calcularMedia(int soma) {
        return (double) soma / TAMANHO;
    }

    // NÃO ALTERE O CÓDIGO DO MÉTODO PRINCIPAL //
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inserir elementos no vetor
        for (int i = 0; i < TAMANHO; i++) {
            int elemento = input.nextInt();
            adicionarElemento(elemento);
            count++;
        }

        // Calcular e exibir soma dos elementos
        int soma = calcularSoma();
        System.out.println("Soma dos elementos: " + soma);

        // Encontrar e exibir o maior valor
        int maior = encontrarMaior();
        System.out.println("Maior valor: " + maior);

        // Encontrar e exibir o menor valor
        int menor = encontrarMenor();
        System.out.println("Menor valor: " + menor);

        // Calcular e exibir a média dos elementos
        double media = calcularMedia(soma);
        System.out.println("Média dos elementos: " + media);
        input.close();
    }
}