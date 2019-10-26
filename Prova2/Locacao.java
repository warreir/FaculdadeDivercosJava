package Prova2;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


class Locacao{
    int id = 0;
    Cliente cliente;
    String dataLocacao;
    String dataDevolucao;
    float valorTotal;
    List<Filme> filmes = new ArrayList<>();
    Date data=new Date();

    Locacao(int id, Cliente cliente){
        this.id = id;
        this.cliente = cliente;
        this.dataLocacao = data;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    void adicionarFilme(Filme filme){
        this.filmes.add(filme);
    }
    float calcularPrecoFinal(){
        for(Filme filme: filmes){
            this.valorTotal += filme.valor;
        }
        return valorTotal;
    }
    void calculaData(){
        int i = this.cliente.dias;
    }
}