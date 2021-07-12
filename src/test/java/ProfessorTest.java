import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void retornaEscolaridadeProfessor() {

        Professor professor = new Professor();
        Escolaridade escolaridade = new Escolaridade();

        escolaridade.setNivelEscolaridade("PhD");
        professor.setEscolaridade(escolaridade);

        assertEquals("PhD", professor.getEscolaridadeProfessor());
    }

    @Test
    void retornaCidadeDeNascimentoDeUmProfessor() {
        Professor professor = new Professor();
        Cidade cidade = new Cidade();

        cidade.setNomeCidade("Juiz de Fora");
        professor.setCidade(cidade);

        assertEquals("Juiz de Fora", professor.getCidade().getNomeCidade());
    }

    @Test
    void retornaTipoDeEnsinoDoProfessor() {
        Professor professor = new Professor();
        TipoEnsino tipoEnsino = new TipoEnsino();
        Curso curso = new Curso();

        tipoEnsino.setTipoDeEnsinoProfessor("Ensino Superior");
        curso.setTipoEnsino(tipoEnsino);
        professor.setCurso(curso);

        assertEquals("Ensino Superior", professor.getTipoDeEnsinoProfessor());
    }
}