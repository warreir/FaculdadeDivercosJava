package AulasJavaNovembro;

import java.sql.Date;

class Funcionario extends Usuario {
    private int id;
    private double salario;
    private String banco;
    private Date dtAdmissao;

<<<<<<< HEAD
    // -----------------------------------GET SET ----------------------------------//
        /**
         * @return the banco
         */
        public String getBanco() {
            return banco;
        }
        /**
         * @return the dtAdmissao
         */
        public Date getDtAdmissao() {
            return dtAdmissao;
        }
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
        /**
         * @return the salario
         */
        public double getSalario() {
            return salario;
        }
        /**
         * @param banco the banco to set
         */
        public void setBanco(String banco) {
            this.banco = banco;
        }
        /**
         * @param dtAdmissao the dtAdmissao to set
         */
        public void setDtAdmissao(Date dtAdmissao) {
            this.dtAdmissao = dtAdmissao;
        }
        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
        /**
         * @param salario the salario to set
         */
        public void setSalario(double salario) {
            this.salario = salario;
        }
    // ----------------------------------- FIM GET SET ----------------------------------//
    // --------------------------------- CONSTRUTOR --------------------------------------//
        Funcionario(int id, String userName,String psw,String nome,int idF,double salario,String banco,Date dtAdmissao){
            super(id,userName,psw,nome);
            this.id=idF;
            this.salario=salario;
            this.banco=banco;
            this.dtAdmissao=dtAdmissao;
        }
    // --------------------------------- FIM CONSTRUTOR --------------------------------------//
    // ---------------------------------- FUNÇÕES ------------------------------------ //
        @Override
        public String getNome(){
            return this.getNome();
        }

        public String tempoContrato(){
            return banco;
        }

        public int qtdVendas(){
            return id;
        }
    // ---------------------------------- FIM FUNÇÕES ------------------------------------ //
=======
    String nome(){
        return banco;
    }
    
    String tempoContrato(){
        return banco;
    }

    int qtdVendas(){
        return id;
    }
>>>>>>> 1d0c1bbdeac02e79376fcd5bb40774893c1da78c
}