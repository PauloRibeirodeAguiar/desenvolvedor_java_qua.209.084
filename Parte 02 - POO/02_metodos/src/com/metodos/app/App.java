package com.metodos.app;

import java.util.Scanner;

import com.metodos.models.Aluno;
import com.metodos.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Professor professor = new Professor();

        Aluno aluno = new Aluno();

        double x;
        double y;

        System.out.println("Informe o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println(aluno.apresentar());

        professor.nome = "Paulo Ribeiro";
        professor.materia = "História";

        System.out.println(professor.darBoasVindas());

        System.out.println("Informe o valor da base: ");
        x = sc.nextDouble();

        System.out.println("Informe o valor da altura: ");
        y = sc.nextDouble();

        System.out.println("A área do quadrilátero é: "+professor.areaQuadrilatero(x, y));
        sc.close();
    }
}


