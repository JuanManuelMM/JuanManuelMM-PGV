package org.example;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        Consumidor consumidor = new Consumidor(almacen);
        Productor productor = new Productor(almacen);

        productor.start();
        consumidor.start();

    }
}

