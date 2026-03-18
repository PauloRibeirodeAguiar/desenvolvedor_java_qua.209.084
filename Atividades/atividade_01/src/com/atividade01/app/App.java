package com.atividade01.app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
         Locale.setDefault(new Locale("US"));

        String nome;
        double peso;
        double altura;
        double imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe o seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Informe sua altura");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.println("Nome: "+nome+" IMC: "+imc+" Diagnóstico: abaixo do peso.");
        } else if(imc < 25){
            System.out.println("Nome: "+nome+" IMC: "+imc+" Diagnóstico: Peso ideal.");
        } else if(imc < 30){
            System.out.println("Nome: "+nome+" IMC: "+imc+" Diagnóstico: Acima do peso.");
        } else if(imc < 35){
            System.out.println("Nome: "+nome+" IMC: "+imc+" Diagnóstico: Obeso.");
        } else if(imc < 40){
            System.out.println("Nome: "+nome+" IMC: "+imc+" Diagnóstico: Obesidade nível 2");
        } else{
        System.out.println("Nome: "+nome+" IMC: "+imc+" Diagnóstico: obesidade mórbida!");
        }
        sc.close();
    }
}