package br.com.attornatus.pessoaendereco.pessoa.application.api;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Value;
@Value
public class PessoaConsultaResponse {
	private UUID idPessoa;
	private String nomeCompleto;
	private LocalDate dataNascimento;
}