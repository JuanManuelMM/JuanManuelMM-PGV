package org.example;

public class RecursoJardin {
    private int cuenta;
    public RecursoJardin(){
        this.cuenta = 100;

    }

    public synchronized void incrementarCuenta(){
        System.out.println(Thread.currentThread().getName() + " --> Entra en el jardín");

        this.cuenta++;

        System.out.println("Hay " + getCuenta() + " personas en el jardín");
    }

    public synchronized void decrementarCuenta(){
        System.out.println(Thread.currentThread().getName() + " --> sale del jardín");

        this.cuenta--;

        System.out.println("Hay " + getCuenta() + " personas en el jardín");
    }

    public int getCuenta() {
        return cuenta;
    }

}
