public class Curso {
    private String nome;
    private int codigo;
    private Aluno [] alunos;
    private Integer totalAlunos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public Aluno[] getAluno() {
        return alunos;
    }

    public void matricularAluno(Aluno aluno){
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }

    public void removerAlunos(Integer matricula){
        int idxRemoved = 0;
        for(int i = 0; i < totalAlunos; i++){
            if(alunos[i].getMatricula().equals(matricula)){
                alunos[i] = null;
                idxRemoved = i;
            }
        }
        for(int i = idxRemoved; i < totalAlunos; i++){
            alunos[i] = alunos[i+1];
        }
        alunos[totalAlunos-1] = null;
        totalAlunos--;
    }

    public Curso(String nome, Integer codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void relatorio(){
        System.out.println(nome + " tem " + totalAlunos + " alunos");
        for(int i = 0; i < totalAlunos; i++){
            System.out.println(alunos[i].getNome());
        }
    }
}
