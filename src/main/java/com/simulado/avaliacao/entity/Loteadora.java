package com.simulado.avaliacao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "Loteadora")
@Table
public class Loteadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nomeFantasia;
    @Column 
    private String razaoSocial;
    @Column
    private String telefone;
    @Column 
    private double percentagemComissao;
     
}
