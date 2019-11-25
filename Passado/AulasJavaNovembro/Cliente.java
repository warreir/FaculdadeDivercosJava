package Passado.AulasJavaNovembro;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

class Cliente extends Usuario {
    private int id;
    private String endereco;
    private String telefone;
    private Date dtCadastro;
    private List<Venda> vendas = new ArrayList<>();
    Cliente(int id, String userName, String psw, String nome,int idC,String endereco,String telefone,Date dtCadastro) {
        super(id, userName, psw, nome);
        this.id = idC;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dtCadastro = dtCadastro;
    }
    // ---------------------- GET SET --------------------------------//
        /**
         * @return the dtCadastro
         */
        public Date getDtCadastro() {
            return dtCadastro;
        }
        /**
         * @return the endereco
         */
        public String getEndereco() {
            return endereco;
        }
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
        /**
         * @return the telefone
         */
        public String getTelefone() {
            return telefone;
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
         * @param dtCadastro the dtCadastro to set
         */
        public void setDtCadastro(Date dtCadastro) {
            this.dtCadastro = dtCadastro;
        }
        /**
         * @param endereco the endereco to set
         */
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
        /**
         * @param telefone the telefone to set
         */
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    // ---------------------- FIM get set --------------------------------//
    // ---------------------- Funções --------------------------------//
        public String tempoContrato(){
            return endereco;
        }
        public int qtdCompras(){
            return id;
        }
        public double valorCompras(){
            return id;
        }
        public String toString() {
            return super.toString()+"\nEndereço: "+this.getEndereco()+"\nTelefone: "+this.getTelefone()+"\nData de Cadastro: "+this.getDtCadastro();
        }
        public void todasVendas(){
            for(Venda venda: vendas){
                venda.mostrarVenda();
            }
        }
     // ---------------------- FIM Funções --------------------------------//
}