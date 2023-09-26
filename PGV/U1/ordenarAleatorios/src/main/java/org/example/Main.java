package org.example;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        for (int j = 0; j <= 40; j++) {
            array.add(sc.nextInt());
        }

        Collections.sort(array);
        for (int i = 0; i <= array.size()-1; i++) {
            System.out.println(array.get(i));
        }


    }

}