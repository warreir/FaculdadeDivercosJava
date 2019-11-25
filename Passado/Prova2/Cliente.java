package Passado.Prova2;
import java.util.ArrayList;
import java.util.List;
class Cliente{
    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private int dias;
    private int filmesLocados;
    List<Locacao> locacoes = new ArrayList<>();

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
        if(locacoes.get(0).getId()!=0){
            System.out.println("Filmes Locados:");
            int aux = 0 ;
            for(Locacao locacao: locacoes){
                aux ++;
                System.out.println(" ----------- Locação - "+aux+ "-------------");
                for(Filme filme: locacao.filmes){
                    System.out.println(filme.getNome());
                }
                locacao.calculaData();
                locacao.calcularPrecoFinal();
                System.out.println("Valor pago:");
                System.out.println("R$: "+locacao.getValorTotal());
                System.out.println("Data Locado:"+locacao.getDataLocacao());
                System.out.println("Data de Devolução:"+locacao.getDataDevolucao());
            }
            System.out.println("Quantidade de locações realizadas foi: "+aux);
        }
    }
}