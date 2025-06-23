package array_list;

import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Abner");
        frutas.add("Frutas");
        frutas.add("aduble");
        frutas.add("Hoje em dia");
        frutas.add("É dificil encontrar");
        frutas.add("Uma menina que não trabalha");
        frutas.add("No Job");
        System.out.println(frutas);
        for(String fruta : frutas){
            System.out.println(fruta);        
        frutas.set(2, "Abner2.0");
        frutas.clear();
        frutas.add("Hoje em dia");
        System.out.println(frutas);
        }
    }
    
}
