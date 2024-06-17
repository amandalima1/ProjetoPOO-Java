package projeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorEmpregados gerenciador = new GerenciadorEmpregados();
        try (Scanner scanner = new Scanner(System.in)) {
            OUTER:
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar Empregado");
                System.out.println("2. Listar Empregados");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                String escolha = scanner.nextLine();
                switch (escolha) {
                    case "1" -> {
                        System.out.print("Nome do empregado: ");
                        String nome = scanner.nextLine();
                        System.out.print("Idade do empregado: ");
                        int idade = Integer.parseInt(scanner.nextLine());
                        System.out.print("Cargo do empregado: ");
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
