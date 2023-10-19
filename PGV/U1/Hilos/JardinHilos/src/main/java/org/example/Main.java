package org.example;

public class Main {
    public static void main(String[] args) {
        RecursoJardin jardin = new RecursoJardin();
        for (int i = 0; i < 10; i++) {
            (new EntrarJardin( "Entra el hilo " + i, jardin)).start();
        }

        for (int i = 0; i < 10; i++) {
            (new SaleJardin( "Sale el hilo " + i, jardin)).start();
        }
    }
}