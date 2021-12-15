package br.com.alura.escola.aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * Aluno
 * <p>
 * Created at 14/12/2021.
 * Entidade pois é uma classe que pode ser diferenciada.
 *
 * @author <a href="mailto:raphael.rossi@engdb.com.br">Raphael Rossi</a>
 */
public class Aluno {

    private CPF cpf;
    private String nome;

    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
