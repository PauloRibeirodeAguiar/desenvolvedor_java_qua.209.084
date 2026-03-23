package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int opcao;
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        do {       

        System.out.println("----------------Lista de Filmes-------------------------\n"
        +"[1] - Sala 01 - A Roda Quadrada - Livre\n"
        +"[2] - Sala 02 - A Volta dos que não foram - Livre\n"   
        +"[3] - Sala 03 - Poeira em Alto Mar - 14 anos\n"
        +"[4] - Sala 04 - As Tranças do Rei Carexca - 16 anos\n"
        +"[5] - Sala 05 - A Vingança do Peixe Frito - 18 anos\n"
        +"[6] - Sair.1\n"
        );
        
        System.out.println("Informe o filme desejado: ");
        opcao = sc.nextInt();

        if (opcao == 1 && opcao ==2) {
            System.out.println("Entrada Liberada, Bom filme!");
        }else if (opcao == 3 && idade < 14) {
            sc.nextLine();
            System.out.println("Entrada proíbida, informe o filme desejado: ");
        
        }
        } while (opcao != 6);
        System.out.println("Obrigado pela preferência!");
        sc.close();
    }    
}
