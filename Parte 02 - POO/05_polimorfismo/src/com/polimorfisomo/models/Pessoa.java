package com.polimorfisomo.models;

abstract public class Pessoa {

    public String email;
    public String telefone;

    //Contrutor
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    //Método
    public void exibirDados(){
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
}
