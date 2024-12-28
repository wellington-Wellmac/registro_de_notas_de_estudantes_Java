import java.util.HashMap;
import java.util.Scanner;

public class RegistroDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> notas = new HashMap<>();
        double soma = 0;
        int count = 0;

        while (true) {
            System.out.println("\n1. Adicionar Nota");
            System.out.println("2. Exibir Média e Resultado");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da disciplina: ");
                    String disciplina = scanner.nextLine();
                    System.out.print("Digite a nota: ");
                    double nota = scanner.nextDouble();
                    notas.put(disciplina, nota);
                    soma += nota;
                    count++;
                    break;

                case 2:
                    System.out.println("Notas cadastradas:");
                    for (String d : notas.keySet()) {
                        System.out.printf("%s: %.2f%n", d, notas.get(d));
                    }
                    double media = soma / count;
                    System.out.printf("Média Final: %.2f%n", media);
                    if (media >= 7) {
                        System.out.println("Situação: Aprovado!");
                    } else {
                        System.out.println("Situação: Reprovado.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

}
