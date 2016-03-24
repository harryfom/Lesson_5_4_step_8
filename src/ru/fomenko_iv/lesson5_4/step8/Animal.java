package ru.fomenko_iv.lesson5_4.step8;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by dns on 24.03.2016.
 */
class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}