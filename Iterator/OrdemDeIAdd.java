package Iterator;

public class OrdemDeIAdd implements IIterator{
    private Aluno[] alunos;
    private int atual;
    public OrdemDeIAdd(Aluno[] alunos){
        this.alunos = alunos;
        atual = 0;
    }
    @Override
    public boolean temProximo() {
        if(alunos.length == 0)
            return false;
        if(alunos.length >atual)
            return true;
        return false;
    }
    @Override
    public Aluno leProximo() {
        Aluno aluno = null;
        if(this.temProximo()){
            aluno = this.alunos[atual];
            atual++;
        }
        return aluno;
    }  
}
