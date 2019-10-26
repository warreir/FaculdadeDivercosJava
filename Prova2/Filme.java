package Prova2;

class Filme{
    int id;
    String nome;
    String dataLancamento;
    String sinopse;
    float valor;
    int estoqueTotal;
    int estoqueAtual;
    int locado;

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
        this.estoqueAtual -=1;
        this.locado +=1;
    }
    public void dadosFilme(){
        System.out.println("Nome: "+nome);
        System.out.println("Data Lançamento: "+dataLancamento);
        System.out.println("Sinope: "+sinopse);
        System.out.println("Valor: R$ "+valor);
        System.out.println("Estoque Atual: "+estoqueAtual);
        System.out.println("Quantidade de locações feitas: "+locado);
    }
}