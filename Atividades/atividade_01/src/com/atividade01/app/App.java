package com.atividade01.app;

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("US"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String  nome = sc.nextLine();

        System.out.println("Informe o seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.println("Informe sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.printf("Nome: "+nome+" IMC: %.2f Diagnóstico: abaixo do peso.",imc);
        } else if(imc < 25){
            System.out.printf("Nome: "+nome+" IMC: %.2f Diagnóstico: Peso ideal.",imc);
        } else if(imc < 30){
            System.out.printf("Nome: "+nome+" IMC: %.2f Diagnóstico: Acima do peso.",imc);
        } else if(imc < 35){
            System.out.printf("Nome: "+nome+" IMC: %.2f Diagnóstico: Obeso.",imc);
        } else if(imc < 40){
            System.out.printf("Nome: "+nome+" IMC: %.2f Diagnóstico: Obesidade nível 2",imc);
        } else{
        System.out.printf("Nome: "+nome+" IMC: %.2f Diagnóstico: obesidade mórbida!", imc);
        }
        sc.close();
    }
}