package Passado.AulasJavaNovembro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 * @author Renan Ponick
 * 
 * 
 */
public class index{
    public static void main(String[] args) {
        int op=9;
        Scanner scanner = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> produtos = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        System.out.println("Bem vindo!");
        do{
            try {
                System.out.println("O que deseja realizar?");
                System.out.println("1 - Cadastro \n2 - Exibição\n9 - Sair");
                op = scanner.nextInt();
                
                switch(op){
                    case 1:{
                        System.out.println("1 - Cadastrar Cliente \n2 - Cadastrar Funcionario \n3 - Cadastrar Produto\n4 - Venda \n9 - Sair");
                        op = scanner.nextInt();
                        if(op == 3){
                            System.out.println("Informe o Nome: ");
                            String nomeProduto = scanner.next();

                            System.out.println("Informe o valor: ");
                            double valorProduto = scanner.nextDouble();

                            int idProduto = produtos.size()+1;

                            Produto produto = new Produto(idProduto, nomeProduto, valorProduto);
                            produtos.add(produto);
                            System.out.println("Produto "+idProduto+" criado com sucesso");
                        }else if(op<3){
                            int idUsuario = (funcionarios.size()+clientes.size())+1;
                            System.out.println("Informe o Login: ");
                            String userName= scanner.next();

                            System.out.println("Informe a Senha: ");
                            String psw= scanner.next();
                            
                            System.out.println("Informe o Nome: ");
                            String nome= scanner.next();
                            switch(op){
                                case 1:{
                                    int idCliente = clientes.size()+1;
                                
                                    System.out.println("Informe o Endereço: ");
                                    String endereco = scanner.next();
                                
                                    System.out.println("Informe o Telefone: ");
                                    String telefone = scanner.next();
                                    
                                    Date dtCadastro = c.getTime();

                                    Cliente cliente = new Cliente(idUsuario, userName, psw, nome, idCliente, endereco, telefone, dtCadastro);
                                    clientes.add(cliente);
                                    System.out.println(clientes.get(0).getNome());
                                    System.out.println("Cliente "+idCliente+" criado com sucesso");
                                    break;
                                }
                                case 2:{
                                    int idFuncionario = funcionarios.size()+1;
                                
                                    System.out.println("Informe o salário (Formato BR): ");
                                    double salario = scanner.nextDouble();
                                
                                    System.out.println("Informe o nome do Banco: ");
                                    String banco = scanner.next();
                                    
                                    Date dtAdmissao = c.getTime();

                                    Funcionario funcionario = new Funcionario(idUsuario, userName, psw, nome, idFuncionario, salario, banco, dtAdmissao);
                                    funcionarios.add(funcionario);
                                    break;
                                }
                            }
                        }else if(op==4){
                            
                            System.out.println("Informe o id do produto: ");
                            int idProduto = scanner.nextInt();
                            idProduto--;
                            
                            System.out.println("Informe a quantidade do produto "+produtos.get(idProduto).getNome());
                            int qtdeProduto = scanner.nextInt();

                            System.out.println("Informe o id do Cliente");
                            int idCliente = scanner.nextInt();
                            idCliente--;

                            System.out.println("Informe o id do Funcionário");
                            int idFuncionario = scanner.nextInt();
                            idFuncionario--;

                            int idVenda = (funcionarios.get(idFuncionario).getVendas().size()+1);

                            Date dataVenda = c.getTime();

                            Venda venda = new Venda(idVenda/*, dataVenda*/, funcionarios.get(idFuncionario), clientes.get(idCliente));
                        }else{
                            System.out.println("Digitou errado");
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("1- Lista de Clientes\n2- Lista de Funcionarios\n3- Lista de Produtos\n4- Vendas por Funcionario\n3- Compras por Cliente");
                        op = scanner.nextInt();

                        switch(op){
                            case 1:{
                                for(Cliente cliente: clientes){
                                    System.out.println(cliente);
                                 }
                                break;
                            }
                            case 2:{
                                for(Funcionario funcionario: funcionarios){
                                   System.out.println(funcionario);
                                }
                                break;
                            }
                            case 3:{
                                for(Produto produto: produtos){
                                   System.out.println(produto);
                                }
                                break;
                            }
                            case 4:{
                                //vendas por funcionario
                                System.out.println("Informe o id do funcionario");
                                int id = scanner.nextInt();
                                id--;
                                try{
                                   System.out.println(funcionarios.get(id).toString());
                                   funcionarios.get(id).todasVendas();
                                } catch (Exception e) {
                                   System.out.println("Id desconhecido"+e);
                                }
                                break;
                            }
                            case 5:{
                                //compras por cliente
                                System.out.println("Informe o id do cliente");
                                int id = scanner.nextInt();
                                id--;
                                try {
                                    System.out.println(clientes.get(id).toString());
                                    clientes.get(id).todasVendas();
                                 } catch (Exception e) {
                                    System.out.println("Id desconhecido"+e);
                                 }
                                break;
                            }
                        }
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Id desconhecido"+e);
            }   
        }while(op != 9);
    }
}