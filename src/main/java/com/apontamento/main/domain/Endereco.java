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
@Entity(name = "endereco")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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


}


 */