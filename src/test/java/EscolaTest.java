import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void retornaEscolaridadeDiretorDeUmaEscola() {

        Professor diretor = new Professor();
        Escolaridade escolaridade = new Escolaridade();
        Escola escola = new Escola();

        escolaridade.setNivelEscolaridade("PhD");
        diretor.setEscolaridade(escolaridade);
        escola.setProfessor(diretor);

        assertEquals("PhD", escola.getProfessor().getEscolaridadeProfessor());
    }

    @Test
    void retornaEstadoEmQueUmAlunoEstuda() {
        Escola escola = new Escola();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        estado.setUnidadeFederativa("RJ");
        cidade.setEstado(estado);
        escola.setCidade(cidade);

        assertEquals("RJ", escola.estadoAluno());
    }

}