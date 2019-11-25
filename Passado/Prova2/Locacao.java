package Passado.Prova2;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class Locacao{
    Calendar c = Calendar.getInstance();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    private int id = 0;
    private Cliente cliente;
    private String dataLocacao;
    private String dataDevolucao;
    private float valorTotal = 0;
    List<Filme> filmes = new ArrayList<>();
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }
    /**
     * @return the dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }
    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }
    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    Locacao(int id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.dataLocacao = formatador.format(c.getTime());
    }
    void adicionarFilme(Filme filme){
        if(filme.getEstoqueAtual()>1){
            this.filmes.add(filme);
            filme.filmeLocado();
            cliente.setFilmesLocados(cliente.getFilmesLocados()+1);
        }else{
            System.out.println("Não é possivel locar este filme, não temos em estoque.");
        }
    }
    void calcularPrecoFinal(){
        for(Filme filme: filmes){
            this.setValorTotal(this.getValorTotal()+filme.getValor());
        }
    }
    void calculaData(){
        c.add(Calendar.DATE, + this.cliente.getDias());
        this.dataDevolucao = formatador.format(c.getTime());
    }
}