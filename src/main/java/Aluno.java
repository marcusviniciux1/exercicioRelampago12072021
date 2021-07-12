public class Aluno extends Pessoa {
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstadoDeNaturalidadeAluno() {
        return this.getCidade().getEstado().getUnidadeFederativa();
    }

    public String getCoordenadorCurso() {
        return this.getCurso().getProfessor().getNome();
    }
}
