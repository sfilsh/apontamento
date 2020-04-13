package com.apontamento.main.domain.schedule;

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
@Entity(name = "schedule")
public class Schedule implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20 , nullable = false)
    private String modulo;
    @Column(length = 20 , nullable = false)
    private String nivel;
    @Column(length = 15, nullable = false)
    private Long taxa_hora;
    @Column(length = 15 , nullable = false)
    private Long valor_hora;
    @Column(length = 12 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date inicio_alocacao;
    @Column(length = 12 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date termino_alocacao;
    @Column(length = 30 , nullable = false)
    private String cliente;
    @Column(length = 40 , nullable = false)
    private String projeto;
    @Column(length = 30 , nullable = false)
    private String endereco_projeto;
    @Column(length = 30 , nullable = false)
    private String modalidade_contratacao;
    @Column(length = 40 , nullable = false)
    private String email_sow;
    @Column(length = 20 , nullable = false)
    private String contrato;
    @Column(length = 30 , nullable = false)
    private String observacao;
    @Column(length = 12 , nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date cv_atualizado;
    @Column(length = 20 , nullable = false)
    private String rh_responsavel;
    @Column(length = 20 , nullable = false)
    private String gestor_responsavel;
    @Column(length = 20 , nullable = false)
    private Long contato_gestor;
    @Column(length = 30 , nullable = false)
    private String email_gestor;


}
