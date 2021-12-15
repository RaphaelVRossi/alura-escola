package br.com.alura.escola.aluno;

/**
 * CPF
 * <p>
 * Created at 14/12/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
public class CPF {

    private static final String CPF_REGEX = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

    private String numero;

    public CPF(String numero) {
        if (numero == null ||
                !numero.matches(CPF_REGEX)) {
            throw new IllegalArgumentException("CPF inválido");
        }

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
