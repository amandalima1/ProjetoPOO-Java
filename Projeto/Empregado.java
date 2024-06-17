package teste;

public class Empregado {
    private final String nome;
    private final int idade;
    private final String cargo;

    public Empregado(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Cargo: " + cargo;
    }
}