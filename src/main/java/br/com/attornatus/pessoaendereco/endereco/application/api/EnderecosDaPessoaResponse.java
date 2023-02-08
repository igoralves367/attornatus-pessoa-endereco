package br.com.attornatus.pessoaendereco.endereco.application.api;

import java.util.UUID;
import lombok.Value;
@Value
public class EnderecosDaPessoaResponse {
	private UUID idEndereco;
	private String lagradouro;
	private String cep;
	private String numero;
	private String cidade;
}