package Passado.AulasJavaNovembro;

class VendaProduto{
    private Produto produto;
    private int qtde;
    // ------------- Construtor --------------//
        VendaProduto(Produto produto, int qtde){
            this.produto = produto;
            this.qtde = qtde;
        }
    // ------------- Fim Construtor --------------//
    // ----------------- GET SET -----------------//
        /**
         * @return the produto
         */
        public Produto getProduto() {
            return produto;
        }
        /**
         * @return the qtde
         */
        public int getQtde() {
            return qtde;
        }
        /**
         * @param produto the produto to set
         */
        public void setProduto(Produto produto) {
            this.produto = produto;
        }
        /**
         * @param qtde the qtde to set
         */
        public void setQtde(int qtde) {
            this.qtde = qtde;
        }
    // -------------- FIM GET SET -----------------//
    // ------------------ FUNÇÕES ---------------- //

    // ---------------- FIM FUNÇÕES ------------- //

}