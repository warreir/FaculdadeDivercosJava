package Passado.classeSolicitada;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class index{
    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu Nome: ");
        Arco arqueiro = new Arco(entrada.next());
        arqueiro.status();

        do{
            System.out.println("--------------------------");
            if(!arqueiro.getCarregado()){
                System.out.println("1 - Carregar");
            }else{
                if(!arqueiro.getMira()){
                    System.out.println("2 - Mirar");
                }else{
                    System.out.println("3 - Atirar");
                    System.out.println("4 - Tirar mira");
                }
            }
            System.out.println("5 - Concertar Arco");
            System.out.println("6 - Recarregar Aljava");
            System.out.println("7 - Status");
            System.out.println("10 - Sair");
            System.out.println("O que deseja realizar: ");
            op = entrada.nextInt();
            switch(op){
                case 1:{
                    arqueiro.carregarFlexa();
                    break;
                }
                case 2:{
                    arqueiro.mirar();
                    break;
                }
                case 3:{
                    arqueiro.atirarFlexa();
                    break;
                }
                case 4:{
                    arqueiro.tirarMira();
                    break;
                }
                case 5:{
                    arqueiro.arrumarArco();
                    break;
                }
                case 6:{
                    arqueiro.aljava.recarregar();
                    break;
                }
                case 7:{
                    arqueiro.status();
                    break;
                }
            }
        }while(op!=10);

    }
}