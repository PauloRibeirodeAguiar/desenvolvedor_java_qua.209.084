package com.ternario.app;

import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(new Locale("US"));

        String nome;
        String result;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        result =  idade >= 18 ? " maior de idade!" : " menor de idade!";

        System.out.println(nome + result);
        sc.close();
    }
}
