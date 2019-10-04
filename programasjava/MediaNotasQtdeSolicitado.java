package programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class MediaNotasQtdeSolicitado{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float soma = 0;
        int qtde;
        try {
            System.out.println("Informe a quantidade de notas");
            qtde = entrada.nextInt();
            float notas[] = new float[qtde];
            for(int i=0;i<qtde; i++){
                System.out.println("Informe a "+(i+1)+"ª nota:");
                notas[i]=entrada.nextFloat();
                soma+=notas[i];
            }
            if((soma/qtde)>=7){
                try {
                    System.out.println("Aprovado Média:");
                    System.out.println(soma/qtde);
                } catch (Exception e) {
                    System.out.println("Erro"+e);
                }
            }else{
                try {
                    System.out.println("Reprovado Média:");
                    System.out.println(soma/qtde);
                } catch (Exception e) {
                    System.out.println("Erro"+e);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro"+e);
        }
        
    }
}