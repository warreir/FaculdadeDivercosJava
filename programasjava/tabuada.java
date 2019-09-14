/**
 *  @author Renan Ponick
 * 
 * 
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tabuada{
    public static void main(String[] args) {
        try{
            BufferedWriter escrever = new BufferedWriter(new FileWriter("./arkivos/arkivo.txt"));
            Scanner entrada = new Scanner(System.in);
            int numero;
            String digitado = "";
            System.out.print("\nEntre com o número : ");
            numero = entrada.nextInt();
            for(int i=0; i<=10; i++){
                digitado += i+" x "+numero+" = "+numero*i+"\n";
            }
            escrever.append(digitado + "\n");
            escrever.close();
        }catch (Exception exception){
            System.out.println("Erro de exceção: " + exception.getMessage());
        }
    }
}