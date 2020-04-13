package com.apontamento.main.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter  @Setter
@Entity(name = "cadastro")
public class Cadastro implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100 , nullable = true)
    private String nome;
    @Column(length = 100 , nullable = true)
    private String nome_pai;
    @Column(length = 100 , nullable = true)
    private String nome_mae;
    @Column(length = 15 , nullable = false)
    private String est_civil;
    @Column(length = 20 , nullable = false)
    private String grau_instrucao;
    @Column(length = 15 , nullable = false)
    private String sexo;
    @Column(length = 20 , nullable = false)
    private String nacionalidade;
    @Column(length = 30 , nullable = false)
    private String cid_nasc;
    @Column(length = 10 , nullable = false)
    private String est_nasc;
    @Column(length = 20 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date dt_nasc;
    @Column(length = 100 , nullable = false, unique = true)
    private String email;
    @Column(length = 40 , nullable = false)
    private String funcao;
    @Column(length = 30 , nullable = false, unique = true)
    private Long cpf;
    @Column(length = 50 , nullable = false)
    private String tp_visto;
    @Column(length = 20 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date dt_chegada_pais;
    @Column(length = 30 , nullable = false)
    private String naturalizado;
    @Column(length = 20 , nullable = false)
    private Long rne_rg;
    @Column(length = 10 , nullable = false)
    private String orgao;
    @Column(length = 10 , nullable = false)
    private String estado;
    @Column(length = 10 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date emissao;
    @Column(length = 10 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date validade;
    @Column(length = 20 , nullable = false, unique = true)
    private Long carteira_motorista;
    @Column(length = 2 , nullable = false)
    private String categoria;
    @Column(length = 10 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date dt_vencimento;
    @Column(length = 50, nullable = false)
    private String endereco;
    @Column(length = 10, nullable = false)
    private Long numero;
    @Column(length = 10, nullable = false)
    private String complemento;
    @Column(length = 30, nullable = false)
    private String bairro;
    @Column(length = 40, nullable = false)
    private String cid_endereco;
    @Column(length = 30, nullable = false)
    private String est_endereco;
    @Column(length = 20, nullable = false)
    private Long cep;
    @Column(length = 20, nullable = false)
    private Long telefone;
    @Column(length = 20, nullable = false)
    private Long celular;
    @Column(length = 50 , nullable = false)
    private String nome_empresa;
    @Column(length = 40 , nullable = false, unique = true)
    private Long cnpj;
    @Column(length = 100 , nullable = false)
    private String endereco_empresa;
    @Column(length = 10 , nullable = false)
    private Long numero_empresa;
    @Column(length = 20 , nullable = false)
    private String bairro_empresa;
    @Column(length = 20 , nullable = false)
    private String cid_empresa;
    @Column(length = 20 , nullable = false)
    private Long cep_empresa;
    @Column(length = 20 , nullable = false)
    private Long insc_estadual;
    @Column(length = 20 , nullable = false)
    private Long insc_municipal;
    @Column(length = 4 , nullable = false)
    private String op_simples_nacional;
    @Column(length = 20 , nullable = false)
    private String cad_prefeitura;
    @Column(length = 20 , nullable = false)
    private Long cod_servico;
    @Column(length = 20 , nullable = false)
    private String bancoPJ;
    @Column(length = 20 , nullable = false)
    private Long agenciaPJ;
    @Column(length = 20 , nullable = false)
    private Long conta_correntePJ;
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
