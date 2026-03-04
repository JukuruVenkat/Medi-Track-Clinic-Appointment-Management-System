package com.venkat.meditrack.util;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {

    private static final IdGenerator INSTANCE = new IdGenerator();
    private AtomicInteger counter = new AtomicInteger(1);

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        return INSTANCE;
    }

    public int generateId() {
        return counter.getAndIncrement();
    }
}