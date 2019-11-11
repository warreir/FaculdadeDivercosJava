package AulasJavaNovembro;

import java.sql.Date;

class Funcionario extends Usuario {
    private int id;
    private double salario;
    private String banco;
    private Date dtAdmissao;

    String nome(){
        return banco;
    }
    
    String tempoContrato(){
        return banco;
    }

    int qtdVendas(){
        return id;
    }
}