package edu.allan.CadastroNinjas.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.allan.CadastroNinjas.models.NinjaModel;

@Repository
public interface NinjaRepository extends JpaRepository <NinjaModel, Long>{
    // Camada responsável por acessar o banco de dados
    // Interface que estende JpaRepository, que já possui os métodos CRUD prontos
    // O primeiro parâmetro é a entidade que será manipulada e o segundo é o tipo do ID da entidade
}
