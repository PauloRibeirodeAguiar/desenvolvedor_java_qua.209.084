package com.atividade07.app;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Locale;
import java.util.Scanner;

import com.atividade07.models.Conta;
import com.atividade07.models.PessoaFisica;
import com.atividade07.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        //TODO: atividade 07
        //Crie um programa de aplicativo de banco: o usuário poderá escolher se
        //deseja entrar como pessoa física ou pesso jurídica, deverá informar o 
        //nome, email e cpf (classe PessoaFisica), ou nome fantasia, razão social,
        //email e cnpj (classe PessoaJuridica), e o programa deverá informar a
        //agência e conta (classe Conta) do titular (os dados do usuário serão
        //setados uma única vez durante todo o programa). Em seguida, o programa
        //deverá exibir as opções para o usuário: consultar dados da conta, fazer 
        //saque, fazer depósito, sair do programa. O programa deverá cobrar uma
        //taxa de 0,01% em cima de cada saque feito pela pessoa jurídica. Qualquer
        //saque só poderá ser feito caso o valor do saque seja menor ou igual ao 
        //saldo da conta.
        //NOTE: use os 4 pilares da orientação a objetos, mais interface e 
        //composição. E o mais importante: DIVIRTAM-SE.
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("[****************************BANCO JAVA***************************]");
        System.out.println("[************************ABERTURA DE CONTA************************]");
        System.out.println("Informe a opção desejada:");
        System.out.println("[1]-Pessoa Física");
        System.out.println("[2]-Pessoa Jurídica");
        System.out.println("[3]-Sair");

        int opcaoConta = sc.nextInt();

        switch (opcaoConta) {
            case 1:
                PessoaFisica pessoaFisica = new PessoaFisica(null, null, null);   
                
                sc.nextLine();
                System.out.println("ABERTURA DE CONTA PESSOA FÍSICA");

                System.out.print("Informe o nome:");    
                pessoaFisica.setNome(sc.nextLine());      
                
                System.out.print("Informe o e-mail: ");    
                pessoaFisica.setEmail(sc.nextLine());    

                System.out.print("Informe o CPF: ");    
                pessoaFisica.setCpf(sc.nextLine());    
                break;
            case 2:
                PessoaJuridica pessoaJuridica = new PessoaJuridica(null, null, null, null); 
                
                sc.nextLine();
                System.out.println("ABERTURA DE CONTA PESSOA JURÍDICA");

                System.out.println("Informe o nome fantasia: ");
                pessoaJuridica.setNomeFantasia(sc.nextLine());      
                
                System.out.println("Informe a razão social: ");
                pessoaJuridica.setRazaoSocial(sc.nextLine());     
                
                System.out.println("Informe o e-mail: ");
                pessoaJuridica.setEmail(sc.nextLine());  
                
                System.out.println("Informe o CNPJ: ");
                pessoaJuridica.setCnpj(sc.nextLine());;            
                break;
            case 3:       
                System.out.println("Obrigado por usar o sistema!");                        
                break;    
            default:
                System.out.println("Opção inválida!");
                break;            
        }        
        sc.close();
    }
}
