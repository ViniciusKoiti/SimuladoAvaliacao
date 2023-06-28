package com.simulado.avaliacao.services.interfaces;

import java.util.List;

public interface CrudService<T> {
    List<T> getAll();
    T getById(long id);
    boolean delete(long id);
    boolean create(T objeto);
}
