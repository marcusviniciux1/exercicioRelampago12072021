public class Escola {
    private Professor professor;
    private Cidade cidade;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String estadoAluno() {
        return this.getCidade().getEstado().getUnidadeFederativa();
    }
}
