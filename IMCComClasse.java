/**Abaixo de 18,5 | Abaixo do Peso
Entre  18.6 e 24,9 | Peso Ideal
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade Grau I
Entre 35,0 e 39,9 | Obesidade Grau II
Acima de 40 | Obesidade Grau III (mórbida) */

/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class IMCComClasse{
    public static void main(String[] args) {
        try{
            Scanner entrada = new Scanner(System.in);
            float imc=0;
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe seu Nome: ");
            pessoa.setNome(entrada.next());
            System.out.println("Informe sua Data de Nascimento: ");
            pessoa.setNascimento(entrada.next());
            System.out.println("Informe seu Altura: ");
            pessoa.setAltura(entrada.nextFloat());
            System.out.println("Informe seu Peso: ");
            pessoa.setPeso(entrada.nextFloat());
            imc = pessoa.imc();
            if((imc<=18.5)){
                    System.out.println("Abaixo do Peso - IMC:"+imc);
                }else if(imc<=24.9){
                        System.out.println("Peso Ideal - IMC:"+imc);
                    }else if(imc<=29.9){
                        System.out.println("Levemente acima do peso - IMC:"+imc);
                        }else if(imc<=34.9){
                            System.out.println("Obesidade Grau I - IMC:"+imc);
                            }else if(imc<=39.9){
                                System.out.println("Obesidade Grau II - IMC:"+imc);
                                }else if(imc>39.9){
                                    System.out.println("Obesidade Grau III (mórbida) - IMC:"+imc);
                                }
        }catch(Exception exe){
            System.out.println("Deu merda aqui:"+ exe);
        }
    }
}