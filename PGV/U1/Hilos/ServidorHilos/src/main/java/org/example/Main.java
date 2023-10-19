package org.example;

public class Main {
    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        for (int i = 0; i < 4; i++) {
            (new EntrarServidor( "Entra el hilo " + i, servidor)).start();
        }


    }
}