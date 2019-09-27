package programasjava;

import java.util.ArrayList;

public class CollectionBaralho {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("J");
        list.add("Q");
        list.add("K");

        for(String value:list){
            System.out.println(value);
        }

        System.out.print("Valor no index 1: ");
        System.out.println(list.get(1));
    }
}