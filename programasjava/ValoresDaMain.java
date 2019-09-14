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
                vetor[i] = Integer.parseInt(arg);
                i++;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(vetor[0]+vetor[1]);
        System.out.println(vetor[0]-vetor[1]);
        System.out.println(vetor[0]*vetor[1]);
        try {
            System.out.println(vetor[0]/vetor[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}