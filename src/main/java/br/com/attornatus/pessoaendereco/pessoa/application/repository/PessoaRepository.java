package br.com.attornatus.pessoaendereco.pessoa.application.repository;

import br.com.attornatus.pessoaendereco.pessoa.domain.Pessoa;

public interface PessoaRepository {
	Pessoa salva(Pessoa pessoa);
}