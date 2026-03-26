package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Veiculo carro = new Veiculo();

        System.out.println("Informe o fabricante do veículo: ");
        carro.fabricante = sc.nextLine();

        System.out.println("Informe o modelo do veículo: ");
        carro.modelo = sc.nextLine();

        System.out.println("Informe a placa do veículo: ");
        carro.placa = sc.nextLine();        

        System.out.println("Informe o ano do veículo: ");
        carro.ano = sc.next();

        System.out.println("Informe a cor do veículo: ");
        carro.cor = sc.nextLine();

        System.out.println("\n");

        System.out.println("Dados do veículo: \n");
        System.out.println("Fabricante: " +carro.fabricante);
        System.out.println("Modelo: " +carro.modelo);
        System.out.println("Placa: " +carro.placa);
        System.out.println("Ano: " +carro.ano);
        System.out.println("Cor: " +carro.cor);

        sc.close();
    }
}
