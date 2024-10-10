import java.util.Scanner;

public class PesquisaPopulacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaSalarios = 0;
        int totalHabitantes = 0;
        int somaFilhos = 0;

        while (true) {
            System.out.print("Digite o salário do habitante (ou um salário negativo para sair): ");
            double salario = scanner.nextDouble();
            if (salario < 0) break;

            System.out.print("Digite o número de filhos do habitante: ");
            int filhos = scanner.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            totalHabitantes++;
        }

        if (totalHabitantes > 0) {
            double mediaSalarial = somaSalarios / totalHabitantes;
            double mediaFilhos = (double) somaFilhos / totalHabitantes;

            System.out.printf("Média salarial da população: %.2f\n", mediaSalarial);
            System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}