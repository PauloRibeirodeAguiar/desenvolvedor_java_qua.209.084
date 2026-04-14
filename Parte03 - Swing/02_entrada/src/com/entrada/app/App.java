package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;

        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Meu nome é: "+nome);
    }
}
