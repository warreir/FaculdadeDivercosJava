package Passado.programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float value1, value2;
        String str;
        char op;
        try{
            System.out.println("Informe o primeiro valor: ");
            value1 = entrada.nextFloat();
            
            System.out.println("Informe o segundo valor: ");
            value2 = entrada.nextFloat();

            System.out.println("Informe a operação (* / + -) :");
            str = entrada.next();

            op = str.charAt(0);
            switch(op){
                case '*':{
                    System.out.println("Multiplicação: " + (value1 * value2));
                    break;
                }
                case '/':{
                    try{
                        System.out.println("Divisão: " + (value1 / value2));
                    }catch (Exception exception){
                        System.out.println("Erro de exceção: " + exception.getMessage());
                    }
                }
                case '+':{
                    System.out.println("Adição: " + (value1 + value2));
                    break;
                }
                case '-':{
                    System.out.println("Subtração: " + (value1 - value2));
                    break;
                }
                default :{
                    System.out.println("Digitou errado");
                    break;
                }
            }
        }catch (Exception exception){
            System.out.println("Erro de exceção: " + exception.getMessage());
        }
    }
}
