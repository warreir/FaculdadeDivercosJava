package Passado.programasjava;
/**
 * @author Renan Ponick
 * 
 */

import java.util.Scanner;
import java.util.Random;
public class NomeCincoPessoas{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] pessoa = new String[3];
        try{
            Random gerador = new Random();
            for (int i = 0; i < 3; i++) {
                System.out.println("Informe o nome de uma pessoa:");
                pessoa[i] = entrada.nextLine();
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(i+1+"ª pessoa: "+pessoa[gerador.nextInt(3)]);
            }
        } catch (Exception exe) {
            System.out.println("Erro: "+exe);;
        }
    }
}