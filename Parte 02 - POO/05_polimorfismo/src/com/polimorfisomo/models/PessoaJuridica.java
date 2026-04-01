package com.polimorfisomo.models;

final public class PessoaJuridica extends Pessoa{

    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {       

        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
}
