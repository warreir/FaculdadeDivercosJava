package Passado.programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class MediaTempAnual{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float soma = 0;
        int qtde=12;
        float temperatura[] = new float[qtde];

        try {
            for(int i=0;i<qtde; i++){
                System.out.println("Informe a "+(i+1)+"ª Temperatura:");
                temperatura[i]=entrada.nextFloat();
                soma+=temperatura[i];
            }
            try {
                System.out.println("Temperatura anual é:");
                System.out.println(soma/qtde);
            } catch (Exception e) {
                System.out.println("Erro"+e);
            }
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
        
    }
}