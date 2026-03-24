package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");

        int numero = sc.nextInt();

        while (numero >= 0) {            
            System.out.println(numero);
            numero-=1;
        }              
        sc.close();
    }
}

