package br.com.alura.escola.aluno;

import br.com.alura.escola.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * EmailTest
 * <p>
 * Created at 14/12/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
class EmailTest {

    private static final String EMAIL_VALIDO = "email@valido.com.br";

    @Test
    void naoDeveriaCriarEmailComEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                new Email(null));
        assertThrows(IllegalArgumentException.class, () ->
                new Email(""));
        assertThrows(IllegalArgumentException.class, () ->
                new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        var email = new Email(EMAIL_VALIDO);

        assertEquals(EMAIL_VALIDO, email.getEndereco());
    }
}
