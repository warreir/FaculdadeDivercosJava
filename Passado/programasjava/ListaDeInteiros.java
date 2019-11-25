package Passado.programasjava;

import java.util.ArrayList;

public class ListaDeInteiros {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(3);

        list1.addAll(list2);
        for(Integer value:list1){
            System.out.println(value);
        }
    }
}