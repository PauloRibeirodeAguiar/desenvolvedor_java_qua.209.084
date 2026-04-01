package com.polimorfisomo.app;

import java.util.Scanner;

import com.polimorfisomo.models.PessoaFisica;
import com.polimorfisomo.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(null, null, 0, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);

        empresa.nomeFantasia = "JavaCafé";
        empresa.cnpj = "00.000.000/0001-00";
        empresa.email = "javacafe@email.com";
        empresa.telefone = "(61) 9999-9999";
              
        System.out.println("Informe o nome: ");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o e-mail: ");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();

        System.out.println("DADOS DO USUÁRIO");
        usuario.exibirDados();
        System.out.println("DADOS DA EMPRESA");
        empresa.exibirDados();

        sc.close();
    }
}
