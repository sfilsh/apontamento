/*package com.apontamento.main.domain;

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
@Entity(name = "documentos")
public class Documento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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


}

 */