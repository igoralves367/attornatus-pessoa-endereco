package br.com.attornatus.pessoaendereco.endereco.application.api;

import java.util.List;
import java.util.UUID;

import br.com.attornatus.pessoaendereco.endereco.domain.Endereco;
import lombok.Value;
@Value
public class EnderecosListResponse {
	private UUID idEndereco;
	private String lagradouro;
	private String cep;
	private String numero;
	private String cidade;
	
	public static List<EnderecosListResponse> converte(List<Endereco> enderecos) {
		// TODO Auto-generated method stub
		return null;
	}
}