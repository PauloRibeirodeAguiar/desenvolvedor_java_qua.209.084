package com.atividade07.models;

import java.math.BigDecimal;


public class ContaPessoaFisica extends Conta{

    private PessoaFisica cliente;

    public ContaPessoaFisica(String agencia, String conta, BigDecimal saldo, PessoaFisica cliente) {
        super(agencia, conta, saldo);
        this.cliente = cliente;
    }    

    public PessoaFisica getCliente() {
        return this.cliente;
    }

    public void setCliente(PessoaFisica cliente) {
        this.cliente = cliente;
    }
    
    
}
