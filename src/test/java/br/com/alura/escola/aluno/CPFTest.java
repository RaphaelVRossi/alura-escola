package br.com.alura.escola.aluno;

import br.com.alura.escola.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * CPFTest
 * <p>
 * Created at 15/12/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
class CPFTest {

    private static final String CPF_VALIDO = "123.123.123-12";

    @Test
    void naoDeveriaCriarCpfComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                new CPF(null));
        assertThrows(IllegalArgumentException.class, () ->
                new CPF(""));
        assertThrows(IllegalArgumentException.class, () ->
                new CPF("ABC.ABC.ABC-AB"));
        assertThrows(IllegalArgumentException.class, () ->
                new CPF("111.11.11-11"));
        assertThrows(IllegalArgumentException.class, () ->
                new CPF("111.111.111-111"));
    }

    @Test
    void deveriaCriarCpfComNumeroValido() {
        var cpf = new CPF(CPF_VALIDO);

        assertEquals(CPF_VALIDO, cpf.getNumero());
    }
}
