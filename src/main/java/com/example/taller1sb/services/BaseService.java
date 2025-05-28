package com.example.taller1sb.services;

import java.util.List;

public interface BaseService <T>{
    T findById(Integer id);
    List<T> getAll();
}
