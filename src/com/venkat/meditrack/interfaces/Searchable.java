package com.venkat.meditrack.interfaces;

import java.util.List;

public interface Searchable<T> {

    List<T> searchByName(String name);

    T searchById(int id);

    List<T> searchByAge(int age);

}