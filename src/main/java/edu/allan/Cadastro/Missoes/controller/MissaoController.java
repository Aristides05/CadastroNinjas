package edu.allan.Cadastro.Missoes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.allan.Cadastro.Missoes.models.MissaoModel;
import edu.allan.Cadastro.Missoes.service.MissaoService;

@RestController
@RequestMapping ("/missao")
public class MissaoController {

    private final MissaoService missaoService; 

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService; 
    }


    @GetMapping
    public String index() {
        return "Bem vindo ao Cadastro de Missões!";
        // listar os endpoints aqui
    }

    @PostMapping("/cadastrar")
    public MissaoModel createMissao(@RequestBody MissaoModel missao) {
        return missaoService.createMissao(missao);
    }

    @PostMapping("/cadastrar-url")
    public MissaoModel saveMissaoUrl(@RequestParam String name,
            @RequestParam String description,
            @RequestParam String rank,
            @RequestParam String status) {

        MissaoModel missao = new MissaoModel(name, description, rank, status);
        return missaoService.createMissao(missao);
    }

    @GetMapping("/listar-todos")
    public List<MissaoModel> listAllMissions() {
        return missaoService.getAllMissoes();
    }

    @GetMapping("/listar-id/{id}")
    public MissaoModel findMissaoById(@PathVariable Long id) {
        return missaoService.getMissaoById(id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleteMissaoById(@PathVariable Long id) {
        missaoService.deleteMissaoById(id);
    }

    @DeleteMapping("/deletar-todos")
    public void deleteAllMissions() {
        missaoService.deleteAllMissao();
    }

    @PutMapping("/atualizar-status/{id}")
    public MissaoModel updateStatusMissao(@PathVariable Long id, @RequestParam String status) {
        return missaoService.updateStatusMissao(id, status);
    }

}
