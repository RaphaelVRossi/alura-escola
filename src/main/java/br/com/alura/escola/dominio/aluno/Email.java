package br.com.alura.escola.dominio.aluno;

/**
 * Email
 * <p>
 * Created at 14/12/2021.
 * Value Object, apenas guarda a informação, não importa se vai repetir
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
public class Email {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-zA-Z]{2,}$";

    private String endereco;

    public Email(String endereco) {
        if (endereco == null ||
                !endereco.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException("E-mail invalido");
        }

        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
