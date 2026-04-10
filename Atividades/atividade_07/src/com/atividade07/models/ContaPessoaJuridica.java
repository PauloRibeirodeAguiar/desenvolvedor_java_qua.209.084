package com.atividade07.models;

import java.math.BigDecimal;

public class ContaPessoaJuridica extends Conta{

    private PessoaJuridica cliente;  
    
    public ContaPessoaJuridica(String agencia, String conta, BigDecimal saldo, PessoaJuridica cliente) {
        super(agencia, conta, saldo);
        this.cliente = cliente;
    }

    public PessoaJuridica getCliente() {
        return this.cliente;
    }

    public void setCliente(PessoaJuridica cliente) {
        this.cliente = cliente;
    }
     
}
