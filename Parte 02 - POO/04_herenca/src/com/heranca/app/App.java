package com.heranca.app;

import java.util.Scanner;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica();

        PessoaJuridica empresa = new PessoaJuridica();

        empresa.razaoSocial = "Java SA";
        empresa.nomeFantasia = "Codar Java";
        empresa.cnpj = "00.000.000/0001-00";
        empresa.email = "java@java.com";
        empresa.telefone = "(61) 99999-9999";
        empresa.endereco = "Brasília-DF";
        empresa.website = "www.java.com.br";

        System.out.println("DADOS DO USUÁRIO: ");
        System.out.println("Informe o nome do usuário: ");
        usuario.nome = sc.nextLine();

        System.out.println("Informe o CPF do usuário: ");
        usuario.cpf = sc.nextLine();

        System.out.println("Informe o e-mail: ");
        usuario.email = sc.nextLine();

        System.out.println("Informe o telefone: ");
        usuario.telefone = sc.nextLine();

        System.out.println("Informe o endereço: ");
        usuario.endereco = sc.nextLine();

        System.out.println("Informe a idade: ");
        usuario.idade = sc.nextInt();

        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));

        sc.close();;
    }
}
