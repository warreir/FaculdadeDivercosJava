package programasjava;
public class ValoresDaMainDois {
    public static void main(String[] args) {
        int i=0;
        int value1 = 0;
        int value2 = 0;
        try{
            for(String arg: args){
                if(i==0){
                    value1 = Integer.parseInt(arg);
                    i++;
                }else{
                    value2 = Integer.parseInt(arg);
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Adição: " + (value1 + value2));
        System.out.println("Subtração: " + (value1 - value2));
        System.out.println("Multiplicação: " + (value1 * value2));
        try{
            System.out.println("Divisão: " + (value1 / value2));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}