package com.pge.pontointeligente.api.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.pge.pontointeligente.api.entites.Funcionario;

@Transactional(readOnly = true)
public interface FuncionarioDao extends JpaRepository<Funcionario, Long> {

	Funcionario findByCpf(String cpf);
	
	Funcionario findByEmail(String email);
	
	Funcionario findByCpfOrEmail(String cpf, String email);
}