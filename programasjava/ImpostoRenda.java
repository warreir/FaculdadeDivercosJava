/**
 * @author Renan Ponick
 * 
 */

import java.util.Scanner;
public class ImpostoRenda{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{
            System.out.println("Informe seu salário: ");
            float salario = entrada.nextFloat();
            if(salario<=1903.98){
                    System.out.println("Isento");
                }else if(salario<=2826.65){
                        System.out.println("Imposto de renda de 7,5%, respectivo a: "+(salario/100)*7.5);
                    }else if(salario<=3751.05){
                        System.out.println("Imposto de renda de 15%, respectivo a: "+(salario/100)*15);
                        }else if(salario<=4664.68){
                            System.out.println("Imposto de renda de 22,5%, respectivo a: "+(salario/100)*22.5);
                            }else if(salario>4664.68){
                                System.out.println("Imposto de renda de 27,5%, respectivo a: "+(salario/100)*27.5);
                            }
        }catch(Exception exe){
            System.out.println("Deu merda aqui:"+ exe);
        }
    }
}