package br.com.alura.escola.aluno;

import br.com.alura.escola.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * TelefoneTest
 * <p>
 * Created at 15/12/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
class TelefoneTest {

    private static final String DDD_VALIDO = "11";
    private static final String NUMERO_VALIDO = "12345678";
    private static final String NUMERO_VALIDO_9_DIGITOS = "123456789";

    @Test
    void naoDeveriaCriarTelefoneComDDDInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("AA", ""));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(DDD_VALIDO, null));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(DDD_VALIDO, ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(DDD_VALIDO, "1111"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(DDD_VALIDO, "aaaa"));
    }

    @Test
    void deveriaCriarTelefoneComDDDENumeroValidos() {
        var telefone = new Telefone(DDD_VALIDO, NUMERO_VALIDO);

        assertEquals(DDD_VALIDO, telefone.getDdd());
        assertEquals(NUMERO_VALIDO, telefone.getNumero());
        assertEquals(8, telefone.getNumero().length());
    }

    @Test
    void deveriaCriarTelefoneComDDDENumero9DigitosValidos() {
        var telefone = new Telefone(DDD_VALIDO, NUMERO_VALIDO_9_DIGITOS);

        assertEquals(DDD_VALIDO, telefone.getDdd());
        assertEquals(NUMERO_VALIDO_9_DIGITOS, telefone.getNumero());
        assertEquals(9, telefone.getNumero().length());
    }

}
