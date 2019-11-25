package Passado.AulasJavaNovembro;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

class Funcionario extends Usuario {
    private int id;
    private double salario;
    private String banco;
    private Date dtAdmissao;
    private List<Venda> vendas = new ArrayList<>();

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
         * @return the vendas
         */
        public List<Venda> getVendas() {
            return vendas;
        }
        /**
         * @param vendas the vendas to set
         */
        public void setVendas(Venda vendas) {
            this.vendas.add(vendas);
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
        public String tempoContrato(){
            return banco;
        }
        public int qtdVendas(){
            return getVendas().size();
        }
        public String toString() {
            return super.toString()+"\nSalario: "+this.getSalario()+"\nBanco: "+this.getBanco()+"\nData de Admissão: "+this.getDtAdmissao();
        }
        public void todasVendas(){
            for(Venda venda: vendas){
                venda.mostrarVenda();
            }
        }
    // ---------------------------------- FIM FUNÇÕES ------------------------------------ //
}