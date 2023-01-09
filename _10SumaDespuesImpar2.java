package ud04;

import java.util.Arrays;

public class _10SumaDespuesImpar2 {
    public static int busquedaNumero(int v[]){
        int i=0 ;
        boolean encontrado = false ;
        while (i<v.length && !encontrado){
        if (v[i]%2 != 0) encontrado = true ;
        else i++ ;
        }
        if (encontrado) 
            return i;
        else return -1;
    }

    public static int sumaArray(int v[]){
        int suma = 0;
        int i = busquedaNumero(v);
        if (i != -1) {
            while(i<v.length){
                suma += v[i];
                i++;
            }
        }
        return suma;
    }



    public static void main(String[] args) {
        int v[] = new int[10];
        int numAle = 0;

        for(int i=0; i<v.length; i++){
            numAle += (int)((Math.random()*5)+1);
            v[i] = numAle;
        }
        System.out.println(Arrays.toString(v));
        System.out.println("El primer numero impar esta en la posición "+busquedaNumero(v));
        System.out.println("La suma es "+sumaArray(v));
    
    }
}
