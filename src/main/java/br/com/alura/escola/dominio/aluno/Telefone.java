package br.com.alura.escola.dominio.aluno;

/**
 * Telefone
 * <p>
 * Created at 15/12/2021.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
public class Telefone {

    private static final String DDD_REGEX = "\\d{2}";
    private static final String NUMERO_REGEX = "\\d{9}|\\d{8}";

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null ||
                !ddd.matches(DDD_REGEX))
            throw new IllegalArgumentException("DDD Inválido");
        if (numero == null ||
                !numero.matches(NUMERO_REGEX))
            throw new IllegalArgumentException("DDD Inválido");
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
