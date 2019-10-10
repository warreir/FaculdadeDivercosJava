class Pessoa{
    private String nome,nascimento;
    private Float peso, altura;
    float imc(){
        return (this.getPeso()/(this.getAltura()*this.getAltura()));
    }
    /**
     * @param altura the altura to set
     */
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }/**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }/**
     * @param peso the peso to set
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    /**
     * @return the altura
     */
    public Float getAltura() {
        return altura;
    }
    /**
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the peso
     */
    public Float getPeso() {
        return peso;
    }
}