package com.apontamento.main.endpoint;



import com.apontamento.main.domain.Cadastro;
import com.apontamento.main.domain.schedule.Schedule;
import com.apontamento.main.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apontamentos")
public class Controller {

    @Autowired
    private Services services;


    //Get do Cadastro
    @GetMapping
    @Secured({ "ROLE_USER", "ROLE_ADMIN" })
    public ResponseEntity<Iterable<Cadastro>> get() {
        return ResponseEntity.ok(services.getCadastro());
        //return new ResponseEntity<>(services.getCadastro(), HttpStatus.OK);
    }

    //Get do Schedule
    @GetMapping("/schedule")
    @Secured({ "ROLE_USER" , "ROLE_ADMIN" })
    public ResponseEntity<Iterable<Schedule>> getSchedule() {
        return ResponseEntity.ok(services.getSchedule());
    }

    //Detalhes do Usuario
    @GetMapping("/userInfo")
    @Secured({ "ROLE_ADMIN" })
    public UserDetails userDetails(@AuthenticationPrincipal UserDetails user) {
        return user;
    }

    //Procurando pelo ID
    @GetMapping("/{id}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity getId(@PathVariable("id") Long id) {
        Optional<Cadastro> cadastro = services.getCadastroById(id);

        // if para verificar se cadastro existe emiti 200 senao 404.
        if (cadastro.isPresent()) {
            return ResponseEntity.ok(cadastro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Procurando pelo ID Schedule
    @GetMapping("/schedule/{id}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity getScheduleId(@PathVariable("id") Long id) {
        Optional<Schedule> schedule = services.getScheduleId(id);

        // if para verificar se cadastro existe emiti 200 senao 404.
        if (schedule.isPresent()) {
            return ResponseEntity.ok(schedule.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Buscando pelo CPF
    @GetMapping("/cpf/{cpf}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity getByCpf(@PathVariable("cpf") Long cpf) {
        Optional<Cadastro> cadastro = services.getCadastroCpf(cpf);

        if(cadastro.isPresent()) {
            return ResponseEntity.ok(cadastro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    //Buscando pela funcao // Se nao estiver vazia retorna o 200 se esta retorna o no content
    @GetMapping("/funcao/{funcao}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity getByfuncao(@PathVariable("funcao") String funcao) {
        List<Cadastro> cadastros = services.getCadastroByFuncao(funcao);

        return cadastros.isEmpty() ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(cadastros);
    }

    //Buscando pelo Nome // Se nao estiver vazia retorna o 200 se esta retorna o no content
    @GetMapping("/nome/{nome}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity getByNome(@PathVariable("nome") String nome) {
        List<Cadastro> cadastros = services.getByNome(nome);

        return cadastros.isEmpty() ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(cadastros);
    }


    //Salvando Cadastro
    @PostMapping
    public ResponseEntity insert(@RequestBody Cadastro cadastro) {

        Cadastro c = services.insert(cadastro);
        URI location = getUri(c.getId());
        return ResponseEntity.created(location).build();
    }

    private URI getUri(Long id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(id).toUri();
    }

    //Post do Schedule
    @PostMapping("/schedule")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity insertSchedule(@RequestBody Schedule schedule) {

        Schedule s = services.insertSchedule(schedule);
        URI location = getScheduleUri(s.getId());
        return ResponseEntity.created(location).build();
    }

    private URI getScheduleUri(Long id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(id).toUri();
    }


    //Atualizando Cadastro
    @PutMapping("/{id}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody Cadastro cadastro) {
        cadastro.setId(id);
        Cadastro c = services.update(cadastro, id);
        return c != null ?
                ResponseEntity.ok(c) :
                ResponseEntity.notFound().build();
    }

    //Atualizando Schedule
    @PutMapping("/schedule/{id}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity updateSchedule(@PathVariable("id") Long id, @RequestBody Schedule schedule) {
        schedule.setId(id);
        Schedule s = services.updateSchedule(schedule, id);
        return s != null ?
                ResponseEntity.ok(s) :
                ResponseEntity.notFound().build();
    }

    //Deletando o registro no Cadastro
    @DeleteMapping("/{id}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity delete(@PathVariable("id") Long id) {
        services.delete(id);
        return ResponseEntity.ok().build();

    }

    //Deletando o registro no Schedule
    @DeleteMapping("/schedule/{id}")
    @Secured({ "ROLE_ADMIN" })
    public ResponseEntity deleteSchedule(@PathVariable("id") Long id) {
        services.deleteSchedule(id);
        return ResponseEntity.ok().build();

    }


}
