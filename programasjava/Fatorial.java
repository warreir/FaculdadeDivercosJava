package programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class Fatorial{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fatorial,resultado=1;
        //recebendo os números
        System.out.println("Digite um número para ter seu fatorial: ");
        fatorial = entrada.nextInt();

        for(int i=fatorial ; i > 1 ; i--){
            resultado=resultado*i;
        }
        System.out.println("Fatorial equivale a:"+resultado);
    }
}