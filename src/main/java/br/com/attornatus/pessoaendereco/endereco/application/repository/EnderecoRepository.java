package br.com.attornatus.pessoaendereco.endereco.application.repository;

import br.com.attornatus.pessoaendereco.endereco.domain.Endereco;

public interface EnderecoRepository {
	Endereco salvaEndereco(Endereco endereco);
}