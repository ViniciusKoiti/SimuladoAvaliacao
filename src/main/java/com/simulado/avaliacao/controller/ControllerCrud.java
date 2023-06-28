package com.simulado.avaliacao.controller;

import java.util.List;

public interface ControllerCrud<T> {
    List<T> getAll();
    T getById(long id);
    boolean delete(long id);
    boolean create(T objeto);
}
