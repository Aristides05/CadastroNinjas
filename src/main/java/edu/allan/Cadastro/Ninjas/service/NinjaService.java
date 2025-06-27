package edu.allan.Cadastro.Ninjas.service;

import org.springframework.stereotype.Service;

import edu.allan.Cadastro.Ninjas.models.NinjaModel;
import edu.allan.Cadastro.Ninjas.repository.NinjaRepository;

import java.util.List;

@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Métodos que nosso modelo: NinjaModel irá utilizar
    public NinjaModel saveNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    public void deleteAllNinjas() {
        ninjaRepository.deleteAll();
    }

    public NinjaModel findNinjaById(Long id) {
        return ninjaRepository.findById(id)
                .orElse(null);
    }

    public List<NinjaModel> findAllNinjas() {
        return ninjaRepository.findAll();
    }

}
