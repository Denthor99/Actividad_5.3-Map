package org.ieslosremedios.daw1.prog.ut5.actividad53;
import java.util.*;
public class Actividad53Main {
    public static void main(String[] args) {
        /**
         * Dado un array de números enteros, escriba un programa en Java que use un objeto Map para contar el número de
         * veces que cada número aparece en el array. El programa debe imprimir los resultados en orden ascendente según
         * el valor del número.
         * */
        // Creamos el array de numeros enteros
        Integer[] enteros={1,2,6,7,3,9,20,13,15};

        // Creamos un objeto map
        Map<Integer,Integer> mapaCount=new TreeMap<>();
        for (Integer numero :
                enteros) {
            if(mapaCount.containsKey(numero)){
                mapaCount.put(numero,mapaCount.get(numero+1));
            }else{
                mapaCount.put(numero,1);
            }
        }
        System.out.println(mapaCount);
    }

}