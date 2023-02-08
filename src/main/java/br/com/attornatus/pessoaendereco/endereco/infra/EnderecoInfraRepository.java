package br.com.attornatus.pessoaendereco.endereco.infra;

import org.springframework.stereotype.Repository;

import br.com.attornatus.pessoaendereco.endereco.application.repository.EnderecoRepository;
import br.com.attornatus.pessoaendereco.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor 
public class EnderecoInfraRepository implements EnderecoRepository {
	private final EnderecoSpringDataJPARepository enderecoSpringDataJPARepository;

	@Override
	public Endereco salvaEndereco(Endereco endereco) {
		log.info("[inicia] EnderecoInfraRepository - salvaEndereco");
		enderecoSpringDataJPARepository.save(endereco);
		log.info("[finaliza] EnderecoInfraRepository - salvaEndereco");
		return endereco;
	}
}