package com.classe.app;

import java.time.LocalDate;
import java.util.Locale;

import javax.swing.JOptionPane;

import com.classe.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(new Locale("pt", "BR"));
        
        Pessoa pessoa = new Pessoa(null, null, null, 0, 0);
        pessoa.setNome(JOptionPane.showInputDialog("Ifnorme o nome: "));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros: ")));
        pessoa.setCpf(JOptionPane.showInputDialog("Informe o CPF: "));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe o e-mail: "));

        JOptionPane.showMessageDialog(null,
            "Nome: "+pessoa.getNome()+
            "\nIdade: "+pessoa.getIdade()+
            "\nAltura: "+pessoa.getAltura()+"m"+
            "\nCPF: "+pessoa.getCpf()+
            "\nE-mail: "+pessoa.getEmail()
            );
    }
}
