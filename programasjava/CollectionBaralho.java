package programasjava;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionBaralho {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> nipe = new ArrayList<>();

        list.add("9");
        list.add("J");
        list.add("Q");
        list.add("K");
        list.add("A");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        nipe.add("Paus");
        nipe.add("Copas");
        nipe.add("Mole");
        nipe.add("Padilha");
        
        Collections.sort(list);

        for(int j=0; j<4; j++){
            for(int i=0; i<=12; i++){
                System.out.println(list.get(i)+" "+nipe.get(j));
            }
        }
    }
}