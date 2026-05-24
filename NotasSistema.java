import java.util.ArrayList;
import java.util.Scanner;

public class NotasSistema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        double nota;

        // Entrada de dados
        System.out.println("Digite as notas (-1 para encerrar):");

        do {

            nota = scanner.nextDouble();

            if (nota != -1) {
                notas.add(nota);
            }

        } while (nota != -1);

        // Quantidade de valores
        System.out.println("\nQuantidade de valores lidos: " + notas.size());

        // Valores na ordem informada
        System.out.println("\nValores na ordem informada:");

        for (Double valor : notas) {
            System.out.print(valor + " ");
        }

        // Valores na ordem inversa
        System.out.println("\n\nValores na ordem inversa:");

        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Soma dos valores
        double soma = 0;

        for (Double valor : notas) {
            soma += valor;
        }

        System.out.println("\nSoma dos valores: " + soma);

        // Média
        double media = soma / notas.size();

        System.out.println("Média dos valores: " + media);

        // Valores acima da média
        int acimaMedia = 0;

        for (Double valor : notas) {

            if (valor > media) {
                acimaMedia++;
            }
        }

        System.out.println("Quantidade acima da média: " + acimaMedia);

        // Valores abaixo de 7
        int abaixoSete = 0;

        for (Double valor : notas) {

            if (valor < 7) {
                abaixoSete++;
            }
        }

        System.out.println("Quantidade abaixo de 7: " + abaixoSete);

        // Mensagem final
        System.out.println("\nPrograma encerrado.");

        scanner.close();
    }
}