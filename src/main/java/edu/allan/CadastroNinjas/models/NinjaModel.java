package edu.allan.CadastroNinjas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity  // Entidade Jpa, utilizada para crair uma tabela no banco de dados
@Table(name = "tb_ninjas")  // Nome da tabela que será criada no banco de dados
@Data  // Lombok, utilizado para gerar os metodos get e set automaticamente
@NoArgsConstructor  // Lombok, utilizado para gerar o construtor sem argumentos
@AllArgsConstructor // Lombok, utilizado para gerar o construtor com argumentos

public class NinjaModel {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; 
    private String village;
    private String rank;
}
 