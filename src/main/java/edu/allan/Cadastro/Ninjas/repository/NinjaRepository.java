package edu.allan.Cadastro.Ninjas.repository;

import org.springframework.stereotype.Repository;

import edu.allan.Cadastro.Ninjas.models.NinjaModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NinjaRepository extends JpaRepository <NinjaModel, Long>{
    // Camada responsável por acessar o banco de dados
    // Interface que estende JpaRepository, que já possui os métodos CRUD prontos
    // O primeiro parâmetro é a entidade que será manipulada e o segundo é o tipo do ID da entidade
}
