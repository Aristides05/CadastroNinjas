package edu.allan.Cadastro.Ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.allan.Cadastro.Ninjas.models.NinjaModel;
import edu.allan.Cadastro.Ninjas.service.NinjaService;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

        @GetMapping
        public String index() {
            return "Bem vindo ao Cadastro de Ninjas!";
            // listar os endpoints aqui
        }

        @PostMapping("/cadastrar")
        public NinjaModel saveNinja(@RequestBody NinjaModel ninja) {
            return ninjaService.saveNinja(ninja);
        }

        @PostMapping("/cadastrar-url")
        public NinjaModel saveNinjaUrl(@RequestParam String name,
                                       @RequestParam String rank,
                                       @RequestParam String village) {

            NinjaModel ninja = new NinjaModel();
            ninja.setName(name);
            ninja.setRank(rank);
            ninja.setVillage(village);
            return ninjaService.saveNinja(ninja);
        }

        @GetMapping("/listar-todos")
        public List<NinjaModel> listAllNinjas() {
            return ninjaService.findAllNinjas();
        }

        @GetMapping("/listar-id/{id}")
        public NinjaModel findNinjaById(@PathVariable Long id) {
            return ninjaService.findNinjaById(id);
        }
}
