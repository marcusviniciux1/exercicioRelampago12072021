import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void retornaEstadoDeNaturalidadeAluno() {
        Aluno aluno = new Aluno();
        Cidade cidade = new Cidade();

        cidade.setNomeCidade("Carmo");
        aluno.setCidade(cidade);

        assertEquals("Carmo", aluno.getCidade().getNomeCidade());
    }

    @Test
    void retornaCoordenadorDoCursoDeUmAluno() {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Curso curso = new Curso();

        professor.setNome("Marco Antonio");
        curso.setProfessor(professor);
        aluno.setCurso(curso);

        assertEquals("Marco Antonio", aluno.getCoordenadorCurso());
    }
}