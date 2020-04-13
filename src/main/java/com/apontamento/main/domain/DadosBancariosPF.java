/*package com.apontamento.main.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter  @Setter
@Entity(name = "dadosBancariosPF")
public class DadosBancariosPF implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10 , nullable = false)
    private Long num_banco;
    @Column(length = 15 , nullable = false)
    private String banco;
    @Column(length = 15 , nullable = false)
    private Long num_agencia;
    @Column(length = 20 , nullable = false)
    private String nome_agencia;
    @Column(length = 15 , nullable = false)
    private Long num_conta;

}

*/