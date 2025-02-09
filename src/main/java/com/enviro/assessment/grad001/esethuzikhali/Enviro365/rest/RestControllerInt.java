package com.enviro.assessment.grad001.esethuzikhali.Enviro365.rest;

import java.util.List;

public interface RestControllerInt<T> {

    //    Get all list mapping
    List<T> getList();

    //    Get individual mapping
    T getById(int id);

    //    post mapping
    T save(T object);

    //    put mapping
    T update(T object);

    //    delete mapping
    String delete(int id);
}
