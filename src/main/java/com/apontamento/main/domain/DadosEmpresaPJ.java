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
@Entity(name = "dadosEmpresaPJ")
public class DadosEmpresaPJ implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

}

*/
