public class Professor extends Pessoa {
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTipoDeEnsinoProfessor() {
        return this.getCurso().getTipoEnsino().getTipoDeEnsinoProfessor();
    }

    public String getEscolaridadeProfessor() {
        return this.getEscolaridade().getNivelEscolaridade();
    }
}
