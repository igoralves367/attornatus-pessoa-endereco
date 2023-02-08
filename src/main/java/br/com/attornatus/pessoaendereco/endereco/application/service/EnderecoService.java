package br.com.attornatus.pessoaendereco.endereco.application.service;

import java.util.UUID;

import br.com.attornatus.pessoaendereco.endereco.application.api.EnderecoRequest;
import br.com.attornatus.pessoaendereco.endereco.application.api.EnderecoResponse;
import br.com.attornatus.pessoaendereco.endereco.application.api.EnderecosDaPessoaResponse;

public interface EnderecoService {
	EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);
	EnderecosDaPessoaResponse buscaEnderecosDaPessoa(UUID idPessoa);
}