package Iterator;

public class Exemplo {
    public static void main(String[] args) {
        Exemplo e = new Exemplo();
        e.iniciar();
    }
    
    public void iniciar(){
        Turma  t = new Turma();
        t.addAluno(new Aluno("Evynne", 23));
        t.addAluno(new Aluno("Avelino", 23));
        t.addAluno(new Aluno("Ster", 18));
        t.addAluno(new Aluno("Dudu", 22));
        t.addAluno(new Aluno("Junior", 26));
        t.addAluno(new Aluno("Samara", 32));
        
        // IIterator it = t.CriarIterator("OrdemDeIAdd");
        IIterator it = t.CriarIterator("OrdemDeIdade");
        
        while (it.temProximo()) {
            System.out.println(it.leProximo().getNome());
        }
    }
}