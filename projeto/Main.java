package projeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerEmpregados gerenciador = new GerEmpregados();
        try (Scanner scanner = new Scanner(System.in)) {
            OUTER:
            while (true) {
                System.out.println("\nEscolha uma opção: ");
                System.out.println("1 - Adicionar Empregado");
                System.out.println("2 - Listar Empregados");
                System.out.println("3 - Sair");
                String escolha = scanner.nextLine();
                switch (escolha) {
                    case "1" -> {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = Integer.parseInt(scanner.nextLine());
                        System.out.print("Cargo: ");
                        String cargo = scanner.nextLine();
                        gerenciador.adicionarEmpregado(nome, idade, cargo);
                    }
                    case "2" -> gerenciador.listarEmpregados();
                    case "3" -> {
                        System.out.println("Saindo...");
                        break OUTER;
                    }
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
            }
        }
    }
}
