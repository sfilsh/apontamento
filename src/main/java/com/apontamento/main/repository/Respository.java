package com.apontamento.main.repository;

import com.apontamento.main.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;


@Repository
public interface Respository extends JpaRepository<Cadastro, Long> {


    List<Cadastro> findByFuncao(String funcao);


    Optional<Cadastro> findByCpf(Long cpf);

    List<Cadastro> findByNome(String nome);
}
