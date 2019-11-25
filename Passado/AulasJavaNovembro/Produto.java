package Passado.AulasJavaNovembro;

class Produto{
    private int id;
    private String nome;
    private double valor;

    // ------------- Construtor --------------//
        Produto(int id, String nome, double valor){
            this.id = id;
            this.nome = nome; 
            this.valor = valor;
        }
    // ------------- Fim Construtor --------------//
    // ----------------- GET SET -----------------//
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
        /**
         * @return the nome
         */
        public String getNome() {
            return nome;
        }
        /**
         * @return the valor
         */
        public double getValor() {
            return valor;
        }
        /**
         * @param valor the valor to set
         */
        public void setValor(double valor) {
            this.valor = valor;
        }
        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }
    // -------------- FIM GET SET -----------------//
    // ------------------ FUNÇÕES ---------------- //
        public String toString(){
            return "ID:"+this.getId()+" - Nome:"+this.getNome()+" - Valor"+this.getValor();
        }
    // ---------------- FIM FUNÇÕES ------------- //
}