package com.atividade07.repository;

import java.math.BigDecimal;

public interface IConta {

    public void exibirDados();
    public BigDecimal depositar(BigDecimal valor);
    public BigDecimal sacar(BigDecimal valor);
}
