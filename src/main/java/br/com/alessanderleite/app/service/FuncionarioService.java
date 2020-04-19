package br.com.alessanderleite.app.service;

import java.util.List;
import java.util.Optional;

import br.com.alessanderleite.app.entities.Funcionario;

public interface FuncionarioService {

	Funcionario persistir(Funcionario funcionario);
	Optional<Funcionario> buscarPorCpf(String cpf);
	Optional<Funcionario> buscarPorEmail(String email);
	Optional<Funcionario> buscarPorId(Long id);
	List<Funcionario> buscarPorEmpresaId(Long id);
}
