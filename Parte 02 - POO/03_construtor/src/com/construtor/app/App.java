package com.construtor.app;

import java.util.Locale;
import java.util.Scanner;

import com.construtor.models.Pessoa;

public class App {
    
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Pessoa usuario = new Pessoa(null, null, null, null, 0, 0);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();
        
        System.out.println("Informe o e-mail: ");
        usuario.email = sc.nextLine();

        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();

        System.out.println("Informe o cpf: ");
        usuario.cpf = sc.nextLine();        

        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();

        System.out.println("Informe a altura em metros: ");
        usuario.altura = sc.nextDouble();

        System.out.println("\n");

        System.out.println("Nome: " +usuario.nome);
        System.out.println("E-mail: " +usuario.email);
        System.out.println("Telefone: " +usuario.telefone);
        System.out.println("CPF: " +usuario.cpf);
        System.out.println("Idade: " +usuario.idade);
        System.out.println("Altura: " +usuario.altura);
        sc.close();
    }
}
