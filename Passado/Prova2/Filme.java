package Passado.Prova2;

class Filme{
    private int id;
    private String nome;
    private String dataLancamento;
    private String sinopse;
    private float valor;
    private int estoqueTotal;
    private int estoqueAtual;
    private int locado;

    
    /**
     * @return the dataLancamento
     */
    public String getDataLancamento() {
        return dataLancamento;
    }
    /**
     * @return the estoqueAtual
     */
    public int getEstoqueAtual() {
        return estoqueAtual;
    }
    /**
     * @return the estoqueTotal
     */
    public int getEstoqueTotal() {
        return estoqueTotal;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the locado
     */
    public int getLocado() {
        return locado;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the sinopse
     */
    public String getSinopse() {
        return sinopse;
    }
    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }
    /**
     * @param dataLancamento the dataLancamento to set
     */
    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    /**
     * @param estoqueAtual the estoqueAtual to set
     */
    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }
    /**
     * @param estoqueTotal the estoqueTotal to set
     */
    public void setEstoqueTotal(int estoqueTotal) {
        this.estoqueTotal = estoqueTotal;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param locado the locado to set
     */
    public void setLocado(int locado) {
        this.locado = locado;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param sinopse the sinopse to set
     */
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    Filme(int id, String nome, String dataLancamento, String sinopse, float valor, int estoqueTotal){
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.sinopse = sinopse;
        this.valor = valor;
        this.estoqueTotal = estoqueTotal;
        this.estoqueAtual = estoqueTotal;
        this.locado = 0;
    }
    public void filmeLocado(){
        this.setEstoqueAtual(this.getEstoqueAtual()-1);
        this.setLocado(this.getLocado()+1);
    }
    public void devolverFilme(){
        this.setEstoqueAtual(this.getEstoqueAtual()+1);
        this.setLocado(this.getLocado()-1);
    }
    public void dadosFilme(){
        System.out.println("Nome: "+getNome());
        System.out.println("Data Lançamento: "+getDataLancamento());
        System.out.println("Sinope: "+getSinopse());
        System.out.println("Valor: R$ "+getValor());
        System.out.println("Estoque Atual: "+getEstoqueAtual());
        System.out.println("Quantidade de locações feitas: "+getLocado());
    }
}