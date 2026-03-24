package com.calculadora.app;

import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();        
        double resut;
        System.out.println("Informe a operaçaõ desejada:\n"+" 1-Adicão \n 2-Subtraçaõ \n 3-Divisão \n 4-Multiplicação.");
        int operador = sc.nextInt();

        switch (operador) {
            case 1:
                   resut = num1 + num2;
                   System.out.println("Soma = "+resut);
                break;

                case 2:
                   resut = num1 - num2;
                   System.out.println("Subtração = "+resut);
                break;

                case 3:
                   resut = num1 / num2;
                   System.out.println("Divisão = "+resut);
                break;

                case 4:
                   resut = num1 * num2;
                   System.out.println("Multiplicação = "+resut);
                break;
        
            default:
                System.out.println("Opção informada inválida!");
                break;
        }

        sc.close();
    }
}
