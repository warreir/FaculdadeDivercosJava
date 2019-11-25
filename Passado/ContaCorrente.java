package Passado;
class ContaCorrente{
    private int numero, agencia;
    private String nome;
    private float saldo;
    
    ContaCorrente(){
        this.setSaldo(0);
    }
    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    void deposito(float valor){
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depositado R$:"+valor);
    }
    void saque(float valor){
        if(valor<=this.getSaldo()){
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Retirado R$:"+valor);
        }else{
            System.out.println("Não é possivel realizar esta operação");
        }
    }
}