package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.*;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    Aluno aluno = new Aluno();
    Professor professor = new Professor();

    double b = 0;
    double h = 0;
    double r = 0;
    double a = 0;
    int opcao;

    professor.nome = "Paulo Ribeiro de Aguiar";
    professor.matricula = "PR12345";

    System.out.println("Nome professo: "+professor.nome);
    System.out.println("Matrícula professor: "+professor.matricula);

    System.out.println("Informe o nome: ");
    aluno.nome = sc.nextLine();

    System.out.println("Informe o e-mail: ");
    aluno.email = sc.nextLine();

    System.out.println("Informe a idade: ");
    aluno.idade = sc.nextInt();

    System.out.println("Nome do aluno: "+aluno.email);
    System.out.println("E-mail do aluno: "+aluno.email);
    System.out.println("Idade do aluno: "+aluno.idade+" anos.");

    System.out.println("[1] - Calcular a área do triângulo.");
    System.out.println("[2] - Calcular a área do círculo.");
    System.out.println("[3] - Calcular a equação do 1º grau.");

    sc.nextLine();

    System.out.println("Informe a opção: ");
    opcao = sc.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Informe o valor da base: ");
            b = sc.nextDouble();

            System.out.println("Informe o valor da altura: ");
            h = sc.nextDouble();

            System.out.println("Área do triângulo : "+professor.areaTriangulo(b, h));
            break;

        case 2:
            System.out.println("Informe o valor do raio: ");
            r = sc.nextDouble();

            System.out.println("Área do círculo é : "+professor.areaCirculo(r));
            break;

        case 3:
            System.out.println("Informe o valor de a: ");
            a = sc.nextDouble();

            System.out.println("Informe o valor de b: ");
            b = sc.nextDouble();

            System.out.println((a !=0 ) ?"A raiz da equação do 1º grau é: "+professor.equecao1Grau(a, b) : "Coeficiente a não pode ser 0.");
            break;
    
        default:
            System.out.println("Valor informado inválido!");
            break;
    }
    sc.close();
    }
}
