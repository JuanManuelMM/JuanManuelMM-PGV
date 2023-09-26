package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void metodoProcesos(String proceso){
        ProcessBuilder procesoNuevo = new ProcessBuilder(proceso);
        try {
            procesoNuevo.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void lanzarProceso(String proceso){

        ProcessBuilder abrirConsola = new ProcessBuilder("ls","-lh");
        try{
            abrirConsola.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = abrirConsola.start();
            process.waitFor();
            System.out.println("Terminado el proceso");

        }catch (IOException e){
            System.out.println("PISTACHOS");

        } catch (InterruptedException e) {
            System.out.println("Doble pistacho");
        }


    }

    public static void buscarFichero(String ruta){

        ProcessBuilder abrirConsola = new ProcessBuilder("cat",ruta);
        try{
            abrirConsola.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = abrirConsola.start();
            process.waitFor();
            System.out.println("Terminado el proceso");

        }catch (IOException e){
            System.out.println("PISTACHOS");

        } catch (InterruptedException e) {
            System.out.println("Doble pistacho");
        }

    }

    public static void hacerPing(String comando){
        ProcessBuilder proceso = new ProcessBuilder(comando, "www.google.com");
        try{
            proceso.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = proceso.start();
            process.waitFor();
            System.out.println("Terminado el proceso");

        }catch (IOException e){
            System.out.println("PISTACHOS");
            e.printStackTrace();

        } catch (InterruptedException e) {
            System.out.println("Doble pistacho");
        }

    }

    public static void hacerIfconfig(String comando){
        ProcessBuilder proceso = new ProcessBuilder(comando);
        try{
            proceso.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            Process process = proceso.start();
            process.waitFor();
            System.out.println("Terminado el proceso");

        }catch (IOException e){
            System.out.println("PISTACHOS");
            e.printStackTrace();

        } catch (InterruptedException e) {
            System.out.println("Doble pistacho");
        }

    }

    public static void main(String[] args) throws IOException {

        //System.out.println("Introduce un nombre de proceso");

       // Scanner sc = new Scanner(System.in);
        //String proceso = sc.nextLine();
        //metodoProcesos(proceso);

        //lanzarProceso("xfce4-terminal");
        //buscarFichero("/home/dam2/Escritorio/Fichero.txt");
        //hacerPing("ping");
        hacerIfconfig("ifconfig");




    }
}