/*package com.apontamento.main.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity(name = "dadosBancariosPJ")
public class DadosBancariosPJ implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20 , nullable = false)
    private String bancoPJ;
    @Column(length = 20 , nullable = false)
    private Long agenciaPJ;
    @Column(length = 20 , nullable = false)
    private Long conta_correntePJ;


}

*/