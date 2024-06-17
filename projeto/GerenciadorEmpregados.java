package projeto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEmpregados {
    private final List<Empregado> empregados;

    public GerenciadorEmpregados() {
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(String nome, int idade, String cargo) {
        Empregado novoEmpregado = new Empregado(nome, idade, cargo);
        empregados.add(novoEmpregado);
        System.out.println("Empregado adicionado com sucesso!");
    }

    public void listarEmpregados() {
        if (empregados.isEmpty()) {
            System.out.println("Nenhum empregado cadastrado.");
        } else {
            for (Empregado empregado : empregados) {
                System.out.println(empregado);
            }
        }
    }
}