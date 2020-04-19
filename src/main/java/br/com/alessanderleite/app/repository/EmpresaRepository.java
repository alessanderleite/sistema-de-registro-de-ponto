package br.com.alessanderleite.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.alessanderleite.app.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
