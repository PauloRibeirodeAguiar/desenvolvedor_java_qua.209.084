package com.metodos.models;

public class Professor {

    public String nome;
    public String materia;

    public String darBoasVindas(){
        return "Olá,meu nome é "+ this.nome+" e dou aula de " +this.materia+".";
    }

    public double areaQuadrilatero(double x, double y){
        return x * y;
    }
}
