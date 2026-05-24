import java.util.ArrayList;
import java.util.Scanner;

public class SalariosVendedores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> vendas = new ArrayList<>();

        // Contadores das faixas salariais
        int[] faixas = new int[9];

        int quantidade;

        System.out.print("Quantos vendedores deseja cadastrar? ");
        quantidade = scanner.nextInt();

        // Entrada das vendas
        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite o valor das vendas do vendedor " + (i + 1) + ": ");
            double vendaBruta = scanner.nextDouble();

            vendas.add(vendaBruta);
        }

        // Cálculo dos salários e contagem das faixas
        for (double venda : vendas) {

            double salario = 200 + (venda * 0.09);

            if (salario >= 1000) {

                faixas[8]++;

            } else {

                int indice = ((int) salario - 200) / 100;

                faixas[indice]++;
            }
        }

        // Exibição dos resultados
        System.out.println("\nQuantidade de vendedores por faixa salarial:");

        System.out.println("$200 - $299: " + faixas[0]);
        System.out.println("$300 - $399: " + faixas[1]);
        System.out.println("$400 - $499: " + faixas[2]);
        System.out.println("$500 - $599: " + faixas[3]);
        System.out.println("$600 - $699: " + faixas[4]);
        System.out.println("$700 - $799: " + faixas[5]);
        System.out.println("$800 - $899: " + faixas[6]);
        System.out.println("$900 - $999: " + faixas[7]);
        System.out.println("$1000 em diante: " + faixas[8]);

        scanner.close();
    }
}
