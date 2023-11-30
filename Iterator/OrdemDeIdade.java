package Iterator;

public class OrdemDeIdade  implements IIterator{
    private Aluno[] alunos;
    private int atual;

    public OrdemDeIdade(Aluno[] alunos){
        this.alunos = alunos;
        this.ordenarPorIdade();
        atual = 0;
    }
    private void ordenarPorIdade(){
        for(int i = 0; i< alunos.length; i++){
            for(int j = i + 1; j<alunos.length; j++){
                if(alunos[i].getIdade() > alunos[j].getIdade()){
                    Aluno aux = alunos[i];
                    alunos[i] = alunos[j];
                    alunos[j] = aux;
                }
            }
        }
    }
    @Override
    public boolean temProximo() {
       return atual < this.alunos.length;
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
