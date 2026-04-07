package com.atividade06.app;

import java.util.Locale;
import java.util.Scanner;

import com.atividade06.models.Moto;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe qual o tipo de veículo deseja cadastrar: ");
        System.out.println("[A]-Moto");
        System.out.println("[B]-Carro");
        System.out.println("[C]-Caminhão");
        System.out.println("[D]-Ônibus");
        String tipoVeiculo = sc.nextLine();

        switch (tipoVeiculo) {
            case "A":
                Moto moto = new Moto(null, null, null, null, null, "A", null);
                
                break;
        
            default:
                break;
        }
        sc.close();
    }
}
