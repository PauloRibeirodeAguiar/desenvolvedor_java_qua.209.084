package com.nota.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de Variaveis
        String nome;
        double nota;
        
        // Instanciar a Classe Scanner 
        Scanner sc = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Informe o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Informe a nota entre 0 e 10: ");
        nota = sc.nextDouble();

        // Verificar se nota é valida
        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println("Aluno: " + nome + " está aprovado.");
            } 
            else if (nota >= 5) {
                System.out.println("Aluno: " + nome + " está de recuperação.");
            }
            else {
                System.out.println("Aluno: " + nome + " está reprovado.");
            }
            
        }
        else{
            System.out.println("Nota inválida.");
        }

        // Fecha objeto Scanner
        sc.close();
    }
}
