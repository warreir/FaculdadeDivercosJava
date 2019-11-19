package AulasJavaNovembro;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

class Venda {
    private int id;
    private Date dataVenda;
    private Funcionario funcionario;
    private Cliente cliente;
    private List<VendaProduto> vendasProdutos = new ArrayList<>();
    private double valorTotal;
    // ------------- Construtor --------------//
        Venda(int id, Date dataVenda, Funcionario funcionario, Cliente cliente){
            this.id = id;
            this.dataVenda = dataVenda;
            this.funcionario = funcionario;
            this.cliente = cliente;
            this.funcionario.getVendas().add(this);
            this.cliente.getVendas().add(this);
        }
    // ------------- Fim Construtor --------------//
    // ----------------- GET SET -----------------//
        /**
         * @return the cliente
         */
        public Cliente getCliente() {
            return cliente;
        }
        /**
         * @return the dataVenda
         */
        public Date getDataVenda() {
            return dataVenda;
        }
        /**
         * @return the funcionario
         */
        public Funcionario getFuncionario() {
            return funcionario;
        }
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }
        /**
         * @return the vendasProdutos
         */
        public List<VendaProduto> getVendasProdutos() {
            return vendasProdutos;
        }
        /**
         * @return the valorTotal
         */
        public double getValorTotal() {
            return valorTotal;
        }
        /**
         * @param valorTotal the valorTotal to set
         */
        public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
        }
        /**
         * @param cliente the cliente to set
         */
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        /**
         * @param dataVenda the dataVenda to set
         */
        public void setDataVenda(Date dataVenda) {
            this.dataVenda = dataVenda;
        }
        /**
         * @param funcionario the funcionario to set
         */
        public void setFuncionario(Funcionario funcionario) {
            this.funcionario = funcionario;
        }
        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
        /**
         * @param vendasProdutos the vendasProdutos to set
         */
        public void setVendasProdutos(List<VendaProduto> vendasProdutos) {
            this.vendasProdutos = vendasProdutos;
        }
    // -------------- FIM GET SET -----------------//
    // ------------------ FUNÇÕES ---------------- //
        public void addProduto(Produto produto, int qtde){
            this.vendasProdutos = new VendaProduto(produto, qtde);
        }
        public void calcularTotal(){
            for(VendaProduto vendaProduto: vendasProdutos){
                this.valorTotal+=(vendaProduto.getProduto().getValor()*vendaProduto.getQtde());
            }
            System.out.println("Valor Final: "+this.getValorTotal());
        }
        public void mostrarVenda(){
            System.out.println("ID: "+this.getId()+"\nCliente: "+this.getCliente().getNome()+"\nValor Total: "+this.getValorTotal());
        }
    // ---------------- FIM FUNÇÕES ------------- //
}