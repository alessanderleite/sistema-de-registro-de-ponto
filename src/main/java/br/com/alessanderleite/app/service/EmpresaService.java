package br.com.alessanderleite.app.service;

import java.util.Optional;

import br.com.alessanderleite.app.entities.Empresa;

public interface EmpresaService {

	Optional<Empresa> buscarPorCnpj(String cnpj);
	Empresa persistir(Empresa empresa);
}
