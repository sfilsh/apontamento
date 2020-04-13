package com.apontamento.main.service;


import com.apontamento.main.domain.Cadastro;
import com.apontamento.main.domain.schedule.Schedule;
import com.apontamento.main.repository.RepositorySchedule;
import com.apontamento.main.repository.Respository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


import java.util.List;
import java.util.Optional;



@Service
public class Services {

    @Autowired
    private Respository repository;

    @Autowired
    private RepositorySchedule repositorySchedule;



    //Get Cadastro
    public Iterable<Cadastro> getCadastro() {
        return repository.findAll();
    }

    //Get Schedule
   public Iterable<Schedule> getSchedule() {
        return repositorySchedule.findAll();
   }


   //Buscando pelo ID do Cadastro
    public Optional<Cadastro> getCadastroById(Long id) {
        Optional<Cadastro> cadastro = repository.findById(id);
        return repository.findById(id);
    }

    //Buscando pelo ID do Schedule
    public Optional<Schedule> getScheduleId(Long id) {
        Optional<Schedule> schedule = repositorySchedule.findById(id);
        return repositorySchedule.findById(id);
    }

    //Buscando pelo CPF Cadastro
    public Optional<Cadastro> getCadastroCpf(Long cpf) {
        Optional<Cadastro> cadastro = repository.findByCpf(cpf);
            return repository.findByCpf(cpf);
        }

    //Buscando pela Funcao Cadastro
    public List<Cadastro> getCadastroByFuncao(String funcao) {
        return repository.findByFuncao(funcao);
    }

    //Buscando pelo Nome Completo Cadastro
    public List<Cadastro> getByNome(String nome) {
        return repository.findByNome(nome);
    }

    //Insert do Cadastro
    public Cadastro insert(Cadastro cadastro) {
        Assert.isNull(cadastro.getId(), "Não foi possivel inserir o registro");
        return repository.save(cadastro);
    }

    //Insert do Schedule
    public Schedule insertSchedule(Schedule schedule) {
        Assert.isNull(schedule.getId(), "Não foi possivel inserir o registro");
        return repositorySchedule.save(schedule);
    }

    //Update do Cadastro
    public Cadastro update(Cadastro cadastro, Long id) {
        Assert.notNull(id, "Não foi possivel atualizar o registro");

        //Buscar o cadastro no bando de dados
        Optional<Cadastro> optional = getCadastroById(id);
        if (optional.isPresent()) {
            Cadastro db = optional.get();

            //Copiar as propriedades
            db.setNome(cadastro.getNome());
            db.setNome_pai(cadastro.getNome_pai());
            db.setNome_mae(cadastro.getNome_mae());
            db.setEst_civil(cadastro.getEst_civil());
            db.setGrau_instrucao(cadastro.getGrau_instrucao());
            db.setSexo(cadastro.getSexo());
            db.setNacionalidade(cadastro.getNacionalidade());
            db.setCid_nasc(cadastro.getCid_nasc());
            db.setEst_nasc(cadastro.getEst_nasc());
            db.setDt_nasc(cadastro.getDt_nasc());
            db.setEmail(cadastro.getEmail());
            db.setFuncao(cadastro.getFuncao());

            System.out.println("Cadastro id" + db.getId());

            //Atualiza o Cadastro
            repository.save(db);

            return db;
        } else {
            throw new RuntimeException("Não foi possivel atualizar o registro");
        }
    }

    //Update do Schedule
    public Schedule updateSchedule(Schedule schedule, Long id) {
        Assert.notNull(id, "Não foi possivel atualizar o registro");

        //Buscar o cadastro no bando de dados
        Optional<Schedule> optional = getScheduleId(id);
        if (optional.isPresent()) {
            Schedule bd = optional.get();

            //Copiar as propriedades
            bd.setModulo(schedule.getModulo());
            bd.setNivel(schedule.getNivel());
            bd.setTaxa_hora(schedule.getTaxa_hora());
            bd.setValor_hora(schedule.getValor_hora());
            bd.setInicio_alocacao(schedule.getInicio_alocacao());
            bd.setTermino_alocacao(schedule.getTermino_alocacao());
            bd.setCliente(schedule.getCliente());
            bd.setProjeto(schedule.getProjeto());
            bd.setEndereco_projeto(schedule.getEndereco_projeto());
            bd.setModalidade_contratacao(schedule.getModalidade_contratacao());
            bd.setEmail_sow(schedule.getEmail_sow());
            bd.setContrato(schedule.getContrato());
            bd.setObservacao(schedule.getObservacao());
            bd.setCv_atualizado(schedule.getCv_atualizado());
            bd.setRh_responsavel(schedule.getRh_responsavel());
            bd.setGestor_responsavel(schedule.getGestor_responsavel());
            bd.setContato_gestor(schedule.getContato_gestor());
            bd.setEmail_gestor(schedule.getEmail_gestor());


            System.out.println("Schedule id" + bd.getId());

            //Atualiza o Schedule
            repositorySchedule.save(bd);

            return bd;
        } else {
            throw new RuntimeException("Não foi possivel atualizar o registro");
        }
    }

    //Deletando o registro no Cadastro
    public void delete(Long id) {
        repository.deleteById(id);
    }

    //Deletando o registro no Schedule
    public void deleteSchedule(Long id) {
        repositorySchedule.deleteById(id);

    }


}

