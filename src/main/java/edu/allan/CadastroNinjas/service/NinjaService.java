package edu.allan.CadastroNinjas.service;

import org.springframework.stereotype.Service;

import edu.allan.CadastroNinjas.models.NinjaModel;
import edu.allan.CadastroNinjas.repository.NinjaRepository;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Métodos que nosso modelo: NinjaModel irá utilizar
    public void saveNinja(NinjaModel ninja) {
        ninjaRepository.save(ninja);
    }

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    public void deleteAllNinjas() {
        ninjaRepository.deleteAll();
    }

    public void findNinjaById(Long id) {
        ninjaRepository.findById(id);
    }

    public void findAllNinjas() {
        ninjaRepository.findAll();
    }

}
