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
        Integer[] enteros={2,7,1,2,6,7,1,3,9,20,13,1,20};

        // Invocamos el metodo creado
        numOcurrencias(enteros);

    }
    public static void numOcurrencias(Integer[] numeros){
        Map<Integer,Integer> mapaNuevo=new TreeMap<Integer,Integer>();
        for (int i = 0; i < numeros.length; i++) {
            int numKey=numeros[i];
            if(mapaNuevo.containsKey(numKey)){
                int contadorKey=mapaNuevo.get(numKey);
                contadorKey++;
                mapaNuevo.put(numKey,contadorKey);
            }else
                mapaNuevo.put(numKey,1);
        }

        Iterator<Integer> iter=mapaNuevo.keySet().iterator();
        while (iter.hasNext()){
            Integer nKey=iter.next();
            System.out.println("El valor "+nKey+ " se encuentra "+mapaNuevo.get(nKey));
        }
    }

}