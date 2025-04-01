public class Aluno {
    private String nome;
    private Integer matricula;
    private String curso;


    /*gets */
    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    /*sets */

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, Integer matricula, String curso){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

}
