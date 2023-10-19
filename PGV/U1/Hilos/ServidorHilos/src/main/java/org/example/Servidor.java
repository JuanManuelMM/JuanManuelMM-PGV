package org.example;

public class Servidor {
    int cuenta;

    public Servidor(){
        this.cuenta=0;
    }

    public void incrementarCuenta() {

            System.out.println(Thread.currentThread().getName() + " --> Entra en el servidor");

            this.cuenta++;

            System.out.println("Hay " + getCuenta() + " personas en el servidor");

    }

    public int getCuenta() {
        return cuenta;
    }
}

