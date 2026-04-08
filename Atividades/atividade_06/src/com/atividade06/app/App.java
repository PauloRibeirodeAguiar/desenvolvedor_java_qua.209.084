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

                System.out.println("Informe o fabricante: ");
                moto.setFabricante(sc.nextLine());

                System.out.println("Informe o modelo: ");
                moto.setModelo(sc.nextLine());

                System.out.println("Informe a cor: ");
                moto.setCor(sc.nextLine());

                System.out.println("Informe a placa: ");
                moto.setPlaca(sc.nextLine());

                System.out.println("Informe o ano: ");
                moto.setAno(sc.nextLine());                

                System.out.println("Informe as cilindradas: ");
                moto.setCilindradas(sc.nextLine());

                System.out.println();

                System.out.println("Fabricante: "+moto.getFabricante());
                System.out.println("Modelo: "+moto.getModelo());
                System.out.println("Cor: "+moto.getCor());
                System.out.println("Placa: "+moto.getPlaca());
                System.out.println("Ano: "+moto.getAno());                
                System.out.println("Categoria: "+moto.getCategoria());
                System.out.println("Cilindradas: "+moto.getCilindradas());
                break;               
        
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();
    }
}
