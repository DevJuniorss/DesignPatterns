package Iterator;

public class Aluno {
    private String nome;
    private int idade;
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + "]";
    }
}
