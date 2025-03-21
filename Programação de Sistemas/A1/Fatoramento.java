import java.util.Scanner;

public class Fatoramento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        // Verificando se o número é negativo
        if (numero < 0) {
            System.out.println("Numero negativo nao possui fatorial definido");
        } else if (numero == 0) {
            System.out.println("Fatorial de 0: 0! = 1");
        } else {
            int fatorial = 1;
            System.out.printf("Fatorial de %d: %d! = ", numero, numero);
            for (int i = numero; i > 1; i--) {
                System.out.print(String.format("%d x ", i));
                fatorial *= i;
            }
            fatorial *= 1;
            System.out.println("1 = " + fatorial);
        }

        // Fechando o scanner
        entrada.close();
    }
}
