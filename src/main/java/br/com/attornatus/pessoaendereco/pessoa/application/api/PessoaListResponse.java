package br.com.attornatus.pessoaendereco.pessoa.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.attornatus.pessoaendereco.pessoa.domain.Pessoa;
import lombok.Value;
@Value
public class PessoaListResponse {
	private UUID idPessoa;
	private String nomeCompleto;
	private LocalDate dataNascimento;
	
	public static List<PessoaListResponse> converte(List<Pessoa> pessoas) {
		// TODO Auto-generated method stub
		return null;
	}
}