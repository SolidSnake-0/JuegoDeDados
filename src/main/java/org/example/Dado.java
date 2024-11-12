package org.example;

public class Dado {
    public int lanzar() {
        return (int) (Math.random() * 6) + 1;
    }
}