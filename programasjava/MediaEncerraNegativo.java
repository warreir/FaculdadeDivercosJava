package programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class MediaEncerraNegativo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota;
        float soma = 0;
        int i=-1, cont=0;
        //recebendo os números
        do{
            i++;
            System.out.print("\nEntre com o número " + (i+1) + ": ");
            nota = entrada.nextInt();
            soma += nota;
            cont++;
        }while(nota>=0);

        if(soma/cont>7){
            System.out.println("Aprovad. Média:");
            System.out.println(soma/cont);
        }else{
            System.out.println("Reprovado. Média:");
            System.out.println(soma/cont);
        }
    }
}