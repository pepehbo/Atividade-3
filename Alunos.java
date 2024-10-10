import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countAlunosNota90 = 0;
        int countReprovados = 0;
        double somaNotas = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY;
        int totalAlunos = 0;

        while (true) {
            System.out.print("Digite a nota final (ou uma nota negativa para sair): ");
            double nota = scanner.nextDouble();
            if (nota < 0) break;

            System.out.print("Digite o total de faltas: ");
            int faltas = scanner.nextInt();

            if (nota >= 90) countAlunosNota90++;
            if (nota < 70 || faltas >= 20) countReprovados++;
            
            if (nota > maiorNota) maiorNota = nota;
            if (nota < menorNota) menorNota = nota;

            somaNotas += nota;
            totalAlunos++;
        }

        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;
            System.out.println("Quantidade de alunos com nota >= 90: " + countAlunosNota90);
            System.out.println("Quantidade de alunos reprovados: " + countReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }

        scanner.close();
    }
}