package Prova2;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class index{
    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);

        List<Filme> filmes = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        //Criando 10 Filmes
        filmes.add(new Filme(filmes.size()+1, "Jhon, e os quem", "25/10/2018", "Uma História", 2, 3));
        filmes.add(new Filme(filmes.size()+1, "A volta dos que não foram", "23/10/2018", "Uma História linda de amor e superação", 1, 4));
        filmes.add(new Filme(filmes.size()+1, "Tranças do Careca", "24/10/2018", "Uma História", 5, 1));
        filmes.add(new Filme(filmes.size()+1, "Se não fosse o quase", "22/10/2018", "Uma História", 1, 5));
        filmes.add(new Filme(filmes.size()+1, "Teste Alfa", "25/10/2018", "Uma História", 5, 2));
        filmes.add(new Filme(filmes.size()+1, "Teste Beta", "25/10/2018", "Uma História", 2, 5));
        filmes.add(new Filme(filmes.size()+1, "Teste 3 - O retorno do Alfa", "25/10/2018", "Uma História", 2, 4));
        filmes.add(new Filme(filmes.size()+1, "Beta, longe de casa", "01/10/2018", "Uma História", 2, 10));
        filmes.add(new Filme(filmes.size()+1, "O final do inicio", "12/12/2018", "Uma História", 1, 5));
        filmes.add(new Filme(filmes.size()+1, "O paraíso do Tártaro", "10/10/2018", "Uma História", 3, 4));

        // Criando clientes
        clientes.add(new Cliente(clientes.size()+1, "Junior Rezende", "15/05/1998", "123.123.123-32", 2));
        clientes.get(0).setLocacao(new Locacao(clientes.get(0).getId()+1, clientes.get(0)));
            // Locando filme para o cliente
            clientes.get(0).getLocacao().adicionarFilme(filmes.get(1));
            clientes.get(0).getLocacao().adicionarFilme(filmes.get(3));
        //Fechando pedido para poder calcular a data e o preço da locacao
        clientes.get(0).fecharPedido();

         // Criando clientes
         clientes.add(new Cliente(clientes.size()+1, "Tafarel Rezende", "12/07/1988", "143.153.123-32", 2));
         clientes.get(1).setLocacao(new Locacao(clientes.get(1).getId()+1, clientes.get(1)));
             // Locando filme para o cliente
             clientes.get(1).getLocacao().adicionarFilme(filmes.get(5));
             clientes.get(1).getLocacao().adicionarFilme(filmes.get(4));
         //Fechando pedido para poder calcular a data e o preço da locacao
         clientes.get(1).fecharPedido();

          // Criando clientes
        clientes.add(new Cliente(clientes.size()+1, "Bolivar Artagne", "15/05/1978", "123.131.123-32", 2));
        clientes.get(2).setLocacao(new Locacao(clientes.get(2).getId()+1, clientes.get(2)));
            // Locando filme para o cliente
            clientes.get(2).getLocacao().adicionarFilme(filmes.get(3));
            clientes.get(2).getLocacao().adicionarFilme(filmes.get(9));
            clientes.get(2).getLocacao().adicionarFilme(filmes.get(1));
            clientes.get(2).getLocacao().adicionarFilme(filmes.get(2));
        //Fechando pedido para poder calcular a data e o preço da locacao
        clientes.get(2).fecharPedido();

         // Criando clientes
         clientes.add(new Cliente(clientes.size()+1, "Junior Rezende", "15/05/1998", "123.123.123-32", 2));
         clientes.get(3).setLocacao(new Locacao(clientes.get(3).getId()+1, clientes.get(3)));
             // Locando filme para o cliente
             clientes.get(3).getLocacao().adicionarFilme(filmes.get(0));
         //Fechando pedido para poder calcular a data e o preço da locacao
         clientes.get(3).fecharPedido();

          // Criando clientes
        clientes.add(new Cliente(clientes.size()+1, "Junior Rezende", "15/05/1998", "123.123.123-32", 2));
        clientes.get(4).setLocacao(new Locacao(clientes.get(4).getId()+1, clientes.get(4)));
            // Locando filme para o cliente
            clientes.get(4).getLocacao().adicionarFilme(filmes.get(5));
            clientes.get(4).getLocacao().adicionarFilme(filmes.get(8));
            clientes.get(4).getLocacao().adicionarFilme(filmes.get(2));
        //Fechando pedido para poder calcular a data e o preço da locacao
        clientes.get(4).fecharPedido();
        
        System.out.println("O que gostaria de executar?");
        System.out.println("1 - Exibir relatórios de clientes");
        System.out.println("2 - Exibir relatórios de filmes");
        op = entrada.nextInt();
        
        switch(op){
            case 1:{
                for(Cliente cliente: clientes){
                    System.out.println("==================");
                    cliente.retornaDados();
                    System.out.println("==================");
                }
                break;
            }
            case 2:{
                for(Filme filme: filmes){
                    System.out.println("==================");
                    filme.dadosFilme();
                    System.out.println("==================");
                }
                break;
            }
        }
    }
}