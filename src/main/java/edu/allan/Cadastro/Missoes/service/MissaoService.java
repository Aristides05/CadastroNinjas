package edu.allan.Cadastro.Missoes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.allan.Cadastro.Missoes.models.MissaoModel;
import edu.allan.Cadastro.Missoes.repository.MissaoRepository;

@Service
public class MissaoService {

    private final MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }


    public MissaoModel createMissao(MissaoModel missao) {
        return missaoRepository.save(missao);
    }

    public void deleteMissaoById(Long Id) {
        missaoRepository.deleteById(Id);
    }

    public void deleteAllMissao() {
        missaoRepository.deleteAll();
    }

    public MissaoModel getMissaoById (Long id) {
        return missaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Missão não encontrada com o ID: " + id));
    }

    public List<MissaoModel> getAllMissoes() {
        return missaoRepository.findAll();
    }

}
