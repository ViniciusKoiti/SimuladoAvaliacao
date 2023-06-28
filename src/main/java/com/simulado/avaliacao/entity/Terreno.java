package com.simulado.avaliacao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Terreno")
@Table
public class Terreno {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private Endereco endereco;
    @Column 
    private Medida medida;
    @Column 
    private double percentagemComissao;
}
