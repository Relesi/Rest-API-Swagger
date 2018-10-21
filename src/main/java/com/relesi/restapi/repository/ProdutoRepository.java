package com.relesi.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relesi.restapi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	Produto findById(long id);
	
}
