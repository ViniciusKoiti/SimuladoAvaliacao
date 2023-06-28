package com.simulado.avaliacao.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulado.avaliacao.entity.Loteadora;
import com.simulado.avaliacao.services.interfaces.LoteadoraService;


@RestController
public class LoteadoraController implements ControllerCrud<Loteadora> {

    private LoteadoraService loteadoraService;

    @Override
    @GetMapping
    public List<Loteadora> getAll() {
        return loteadoraService.getAll();
    }

    @Override
    public Loteadora getById(long id) {
       return loteadoraService.getById(id);
    }

    @Override
    public boolean delete(long id) {
       return loteadoraService.delete(id);
    }

    @Override
    public boolean create(Loteadora objeto) {
        return loteadoraService.create(objeto);
    }
}
