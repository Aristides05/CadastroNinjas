package edu.allan.Cadastro.Missoes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; 
    private String description; 
    private String rank;
    private String status; // "Pendente", "Em Andamento", "Conclu

    public MissaoModel(String name, String description, String rank, String status) {
        this.name = name;
        this.description = description;
        this.rank = rank;
        this.status = status;
    }

}
