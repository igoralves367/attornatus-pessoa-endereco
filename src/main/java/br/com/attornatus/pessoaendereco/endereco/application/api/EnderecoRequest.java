package br.com.attornatus.pessoaendereco.endereco.application.api;

import javax.validation.constraints.NotBlank;

import lombok.Value;
@Value
public class EnderecoRequest {
	@NotBlank
	private String lagradouro;
	@NotBlank
	private String cep;
	@NotBlank
	private String numero;
	@NotBlank
	private String cidade;
}