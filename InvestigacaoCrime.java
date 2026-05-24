import java.util.ArrayList;
import java.util.Scanner;

public class InvestigacaoCrime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;

        // Fazer perguntas
        for (String pergunta : perguntas) {

            System.out.print(pergunta + " (sim/não): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                respostasPositivas++;
            }
        }

        // Classificação
        System.out.println("\nResultado da investigação:");

        if (respostasPositivas == 2) {

            System.out.println("Classificação: Suspeita");

        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {

            System.out.println("Classificação: Cúmplice");

        } else if (respostasPositivas == 5) {

            System.out.println("Classificação: Assassino");

        } else {

            System.out.println("Classificação: Inocente");
        }

        scanner.close();
    }
}