import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void retornaEscolaridadeCoordenadorDeUmCurso() {

        Professor coordenador = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Curso curso = new Curso();

        escolaridade.setNivelEscolaridade("PhD");
        coordenador.setEscolaridade(escolaridade);
        curso.setProfessor(coordenador);

        assertEquals("PhD", curso.getProfessor().getEscolaridadeProfessor());
    }
}