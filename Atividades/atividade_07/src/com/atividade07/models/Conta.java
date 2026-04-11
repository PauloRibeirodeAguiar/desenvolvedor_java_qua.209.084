package com.atividade07.models;

import java.math.BigDecimal;

import com.atividade07.repository.IConta;

public abstract class Conta implements IConta{

    private String agencia;
    private String conta;
    protected BigDecimal saldo;

    public Conta(String agencia, String conta, BigDecimal saldo2) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo2;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public BigDecimal depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Número da conta: "+conta);
        System.out.println("Número da agência: "+agencia);
        System.out.println("Saldo da conta: "+saldo);
    }

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);        
        return this.saldo;
    }
    
}
