/*package com.apontamento.main.DTO;

import com.apontamento.main.domain.Cadastro;
import lombok.Data;
import org.modelmapper.ModelMapper;


@Data
public class CadastroDTO {

    private Long id;
    private String nome_completo;
    private String email;
    private String funcao;

     //public CadastroDTO(Cadastro cadastro) {
      //  this.id = cadastro.getId();
      //  this.nome_completo = cadastro.getNome_completo();
     //   this.email = cadastro.getEmail();
     //   this.funcao = cadastro.getFuncao();
   // }

    public static CadastroDTO create(Cadastro cadastro) {
        ModelMapper modelMapper= new ModelMapper();
        return modelMapper.map(cadastro, CadastroDTO.class);
    }
}*/
