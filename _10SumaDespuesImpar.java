package ud04;
// Escribir un método que, dado un array de enteros, devuelva la
// suma de los elementos que aparecen tras el primer valor impar. Usar main para probar el
// método

import java.util.Arrays;

public class _10SumaDespuesImpar {

    public static String sumaArray(int v[]){
        int i=0 ;
        boolean encontrado = false ;
        while (i<v.length && !encontrado){
        if (v[i]%2 != 0) encontrado = true ;
        else i++ ;
        }
        int pos = i;

        int suma = 0;
            while(i<v.length){
                suma += v[i];
                i++;
            }
        
        return "El primer numero impar esta en la posición "+pos+" y la suma de todos los numeros desde el primer numero impar es "+suma;

    }

    public static void main(String[] args) {
        int v[] = new int[10];
        int numAle = 0;

        for(int i=0; i<v.length; i++){
            numAle += (int)((Math.random()*5)+1);
            v[i] = numAle;
        }
        System.out.println(Arrays.toString(v));
        System.out.println("El primer numero impar esta en la posición "+sumaArray(v));
    
    }
}
