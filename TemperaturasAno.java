import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturasAno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<>();

        String[] meses = {
            "Janeiro",
            "Fevereiro",
            "Março",
            "Abril",
            "Maio",
            "Junho",
            "Julho",
            "Agosto",
            "Setembro",
            "Outubro",
            "Novembro",
            "Dezembro"
        };

        double soma = 0;

        // Entrada das temperaturas
        for (int i = 0; i < 12; i++) {

            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            double temperatura = scanner.nextDouble();

            temperaturas.add(temperatura);

            soma += temperatura;
        }

        // Cálculo da média anual
        double mediaAnual = soma / 12;

        System.out.println("\nMédia anual das temperaturas: " + mediaAnual);

        // Mostrar temperaturas acima da média
        System.out.println("\nTemperaturas acima da média anual:");

        for (int i = 0; i < temperaturas.size(); i++) {

            if (temperaturas.get(i) > mediaAnual) {

                System.out.println(
                    meses[i] + " -> " + temperaturas.get(i) + "°C");
            }
        }

        scanner.close();
    }
}