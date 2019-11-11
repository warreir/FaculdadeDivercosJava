package AulasJavaNovembro;

import java.sql.Date;

class Funcionario extends Usuario {
    private int id;
    private String endereco;
    private String telefone;
    private Date dtCadastro;

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
    
        String tempoContrato(){
            return endereco;
        }

        int qtdCompras(){
            return id;
        }
        double valorCompras(){
            return id;
        }
     // ---------------------- FIM Funções --------------------------------//
}