package Prova2;
class Cliente{
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private int dias;
    private int filmesLocados;
    private Locacao locacao;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }
    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }
    /**
     * @return the filmesLocados
     */
    public int getFilmesLocados() {
        return filmesLocados;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the locacao
     */
    public Locacao getLocacao() {
        return locacao;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
    /**
     * @param filmesLocados the filmesLocados to set
     */
    public void setFilmesLocados(int filmesLocados) {
        this.filmesLocados = filmesLocados;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param locacao the locacao to set
     */
    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    Cliente(int id, String nome, String dataNascimento, String cpf, int dias){
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.dias = dias;
        this.filmesLocados = 0;
    }
    public void retornaDados(){
        System.out.println("Id:"+this.getId());
        System.out.println("Nome:"+this.getNome());
        System.out.println("Nascido em:"+this.getDataNascimento());
        System.out.println("Cpf :"+this.getCpf());
        System.out.println("Dias para devolução:"+this.getDias());
        System.out.println("Qtde Filmes Locados:"+this.getFilmesLocados());
        if(locacao.getId()!=0){
            System.out.println("Filmes Locados:");
            for(Filme filme: getLocacao().filmes){
                System.out.println(filme.getNome());
            }
            System.out.println("Valor pago:");
            System.out.println("R$: "+ getLocacao().getValorTotal());
            System.out.println("Data Locado:"+getLocacao().getDataLocacao());
            System.out.println("Data de Devolução:"+getLocacao().getDataDevolucao());
        }
    }
    public void fecharPedido(){
        this.getLocacao().calculaData();
        this.getLocacao().calcularPrecoFinal();
    }
}