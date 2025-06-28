package edu.allan.Cadastro.Missoes.repository;

import edu.allan.Cadastro.Missoes.models.MissaoModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Por exemplo, para buscar missões por status ou rank

}
