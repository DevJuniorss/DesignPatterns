package Iterator;

import java.util.ArrayList;

public class Turma implements IAgregator {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    @Override
    public IIterator CriarIterator(String tipo) {
        Aluno a[] = new Aluno[this.alunos.size()];
        switch (tipo) {
            case "OrdemDeIAdd": return new OrdemDeIAdd(this.alunos.toArray(a));
            case "OrdemDeIdade": return new OrdemDeIdade(this.alunos.toArray(a));
            default:return new OrdemDeIAdd(this.alunos.toArray(a));
        }
    }
    
}
