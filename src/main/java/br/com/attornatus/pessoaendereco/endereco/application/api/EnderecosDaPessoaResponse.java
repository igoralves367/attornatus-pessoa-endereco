package br.com.attornatus.pessoaendereco.endereco.application.api;

import java.util.UUID;

import br.com.attornatus.pessoaendereco.endereco.domain.Endereco;
import lombok.Value;
@Value
public class EnderecosDaPessoaResponse {
	private UUID idEndereco;
	private String lagradouro;
	private String cep;
	private String numero;
	private String cidade;
	
	public EnderecosDaPessoaResponse(Endereco endereco) {
		this.idEndereco = endereco.getIdEndereco();
		this.lagradouro = endereco.getLagradouro();
		this.cep = endereco.getCep();
		this.numero = endereco.getNumero();
		this.cidade = endereco.getCidade();
	}	
}