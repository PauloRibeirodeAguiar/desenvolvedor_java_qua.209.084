package com.classe.app;

public class Pessoa {

    public String nome;
    public String email;
    public int idade;
    public double altura;    

    public void cumprimentar(){
        System.out.println("Olá, boa noite!");
    }

    public void apresentar(){
        System.out.println
        ("Meu nome é: "+this.nome +
        "\nmeu e-mail é: "+ this.email +
        "\ntenho: "+this.idade+" anos" +
        "\nminha altura é: "+this.altura);
    }
}
