package com.composicao.app;

import java.util.Locale;
import java.util.Scanner;

import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa motorista = new Pessoa(null, null, null, null, null);

        Veiculo carro = new Veiculo(null, null, null, null, null, null, motorista);

        System.out.println("**********DADOS DO MOTORISTA******************");
        System.out.print("Informe o nome do motorista: ");
        motorista.setNome(sc.nextLine());

        System.out.print("Informe o CPF do motorista: ");
        motorista.setCpf(sc.nextLine());

        System.out.print("Informe o telefone do motorista: ");
        motorista.setTelefone(sc.nextLine());

        System.out.print("Informe o e-mail do motorista: ");
        motorista.setEmail(sc.nextLine());

        System.out.print("Informe a CNH do motorista: ");
        motorista.setCnh(sc.nextLine());

        System.out.println();
        System.out.println("**********DADOS DO CARRO**********************");
        System.out.print("Informe o fabricante do carro: ");
        carro.setFabricante(sc.nextLine());

        System.out.print("Informe o modelo do carro: ");
        carro.setModelo(sc.nextLine());

        System.out.print("Informe a cor do carro: ");
        carro.setCor(sc.nextLine());

        System.out.print("Informe o ano do carro: ");
        carro.setAno(sc.nextLine());

        System.out.print("Informe a placa do carro: ");
        carro.setPlaca(sc.nextLine());

        System.out.print("Informe o renavan do carro: ");
        carro.setRenavan(sc.nextLine());

        carro.setMotorista(motorista);

        System.out.println();

        System.out.println("Fabricante do carro: "+carro.getFabricante());
        System.out.println("Modelo do carro: "+carro.getModelo());
        System.out.println("Cor do carro: "+carro.getCor());
        System.out.println("Ano do carro: "+carro.getAno());
        System.out.println("Placa do carro: "+carro.getPlaca());
        System.out.println("Renavan do carro: "+carro.getRenavan());
        System.out.println("Nome do motorista do carro: "+carro.getMotorista().getNome());
        System.out.println("CPF do motorista do carro: "+carro.getMotorista().getCpf());
        System.out.println("Telefone do motorista do carro: "+carro.getMotorista().getTelefone());
        System.out.println("E-mail do motorista do carro: "+carro.getMotorista().getEmail());
        System.out.println("CNH do motorista do carro: "+carro.getMotorista().getCnh());        
        sc.close();
    }
}
