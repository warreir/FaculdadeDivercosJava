/**
 * @author Renan Ponick
 * 
 */

import java.util.Scanner;
public class CalcularDecimo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int meses=0;
        float salario = 0;
        try{
            System.out.println("Informe seu salário bruto: ");
            salario = entrada.nextFloat();
            do{
                System.out.println("Informe quantidade de meses trabalhados: ");
                meses = entrada.nextInt();
            }while((meses<0)||(meses>12));
        }catch(Exception exe){
            System.out.println("Deu merda aqui:"+ exe);
        }
        try{
            float salariomes = salario/12;
            float valordecimo = (salariomes*meses);
            valordecimo -= (valordecimo/100)*9;
            System.out.println(valordecimo);
        } catch (Exception exe) {
            System.out.println("Deu merda aqui 2:"+ exe);
        }
    }
}