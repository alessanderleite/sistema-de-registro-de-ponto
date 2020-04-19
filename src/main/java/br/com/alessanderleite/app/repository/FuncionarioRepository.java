package br.com.alessanderleite.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.alessanderleite.app.entities.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	Funcionario findByCpf(String cpf);
	Funcionario findByEmail(String email);
	Funcionario findByCpfOrEmail(String cpf, String email);
	List<Funcionario> findByEmpresaId(Long id);
}
