package com.venkat.meditrack.util;

import java.util.ArrayList;
import java.util.List;

public class DataStore<T> {

    private List<T> list = new ArrayList<>();

    public void add(T obj) { list.add(obj); }
    public List<T> getAll() { return list; }
}