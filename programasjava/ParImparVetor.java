package programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class ParImparVetor{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtde=5, i;
        int valores[] = new int[qtde];
        try {
            for(i=0; i<qtde; i++){
                System.out.println("Informe o "+(i+1)+"º número:");
                valores[i] = entrada.nextInt();
            }
            System.out.println("-------PARES-------");
            for(i=0; i<qtde; i++){
                if(valores[i]%2==0){
                    System.out.println(valores[i]);
                }
            }
            System.out.println("------IMPARES------");
            for(i=0; i<qtde; i++){
                if(valores[i]%2==1){
                    System.out.println(valores[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
        
    }
}