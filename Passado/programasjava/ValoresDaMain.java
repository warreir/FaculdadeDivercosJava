package Passado.programasjava;
/**
 *  @author Renan Ponick
 * 
 * 
*/
public class ValoresDaMain{
    public static void main(String[] args) {
        int[] vetor = new int[2];
        int i=0;
        try{
            for(String arg : args){
                System.out.println("\n"+i);
                vetor[i] = Integer.parseInt(arg);
                i++;
            }
            System.out.println("soma "+ (vetor[0]+vetor[1]));
            System.out.println("subtracao "+(vetor[0]-vetor[1]));
            System.out.println("multi "+vetor[0]*vetor[1]);
            try {
                System.out.println("div "+vetor[0]/vetor[1]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}