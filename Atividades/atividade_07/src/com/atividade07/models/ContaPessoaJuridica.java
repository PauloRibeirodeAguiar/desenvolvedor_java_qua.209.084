package com.atividade07.models;

import java.math.BigDecimal;

public class ContaPessoaJuridica extends Conta{

    private PessoaJuridica pessoaJuridica;  
    
    public ContaPessoaJuridica(String agencia, String conta, BigDecimal saldo, PessoaJuridica pessoaJuridica) {
        super(agencia, conta, saldo);
        this.pessoaJuridica = pessoaJuridica;
    }

    public PessoaJuridica getCliente() {
        return this.pessoaJuridica;
    }

    public void setCliente(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
     
    public void exibirDados(){
        System.out.println("Razão socical: "+this.pessoaJuridica.getRazaoSocial());
        System.out.println("Nome Fantasia: "+this.pessoaJuridica.getNomeFantasia());
        System.out.println("CNPJ: "+this.pessoaJuridica.getCnpj());
        System.out.println("E-mail: "+this.pessoaJuridica.getEmail());
        super.exibirDados();
    }
    
}
