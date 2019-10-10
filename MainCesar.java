/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
public class MainCesar{
    public static void main(String[] args) {
        String texto;
        int qtde;
        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("Informe seu Texto: ");
            texto = entrada.nextLine();
            System.out.println("Informe o número base: ");
            qtde = entrada.nextInt();

            CriptografiaDeCesar cesar = new CriptografiaDeCesar(texto,qtde);
            System.out.println("Texto Original: "+cesar.getInicial());
            System.out.println("Texto Criptografado: "+cesar.getCriptografado());
        }catch(Exception exe){
            System.out.println("Deu merda aqui:"+ exe);
        }
    }
}