package com.example.AtmTransaction.service;

import java.util.List;

public interface Iservice <T,t >{
    T create(T t);
    T read(String id);
    void delete(String id);
    T update(T t);
    List<T> readAll();

}
