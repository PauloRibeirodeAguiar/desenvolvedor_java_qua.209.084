package com.classe.app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(new Locale("US"));

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
       
        System.out.println("Informe o nome da pessoa: ");
        pessoa.nome = sc.nextLine();        

        System.out.println("Informe o e-mail da pessoa: ");
        pessoa.email = sc.nextLine();

        System.out.println("Informe a idade da pessoa: ");
        pessoa.idade = sc.nextInt();

        System.out.println("Informe a altura da pessoa: ");
        pessoa.altura = sc.nextDouble();

        System.out.println("\n");

        pessoa.cumprimentar(); 
        pessoa.apresentar();      

        sc.close();
    }
}
