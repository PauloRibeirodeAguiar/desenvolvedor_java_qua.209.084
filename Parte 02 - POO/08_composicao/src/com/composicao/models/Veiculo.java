package com.composicao.models;

public class Veiculo {

    private String fabricante;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String renavan;
    private Pessoa motorista;

    public Veiculo(String fabricante, String modelo, String ano, String cor, String placa, String renavan, Pessoa motorista) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.renavan = renavan;
        this.motorista = motorista;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavan() {
        return this.renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public Pessoa getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }

}
