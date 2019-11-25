/**
 *  @author Renan Ponick
 * 
 * 
*/
package Passado;

import java.util.Scanner;
public class MainCC{
    public static void main(String[] args) {
        int op = 0;
        try{
            Scanner entrada = new Scanner(System.in);
            ContaCorrente conta = new ContaCorrente();
            System.out.println("Informe seu Nome: ");
            conta.setNome(entrada.next());

            System.out.println("Informe o número: ");
            conta.setNumero(entrada.nextInt());

            System.out.println("Informe seu agência: ");
            conta.setAgencia(entrada.nextInt());

            do{
                System.out.println("Qual operação deseja realizar? 1=Deposito 2=Saque 3=Consultar Saldo 4=Sair");
                op = entrada.nextInt();
                switch(op){
                    case 1:{
                        System.out.println("Informe valor para depositar: ");
                        conta.deposito(entrada.nextFloat());
                        break;
                    }
                    case 2:{
                        System.out.println("Informe valor para sacar: ");
                        conta.saque(entrada.nextFloat());
                        break;
                    }
                    case 3:{
                        System.out.println("Saldo: "+conta.getSaldo());
                        break;
                    }
                }

            }while(op!=4)
;           
        }catch(Exception exe){
            System.out.println("Deu merda aqui:"+ exe);
        }
    }
}