package Passado.programasjava;
/**
 *  @author Renan Ponick
 * 
*/
import java.util.Scanner;
public class DezValoresDouble{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtde=10;
        double vetor[] = new double[qtde];
        try {
            for(int i=0;i<qtde; i++){
                System.out.println("Informe o "+(i+1)+"º número:");
                vetor[i]=entrada.nextDouble();
            }
            for(double vet : vetor) {
                System.out.println(vet);
            }
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
        
    }
}