
package u06e11;

import java.util.Scanner;

public class U06E11 {
    
    public static void main(String args[]) {
        int largo=0;
        int[] a = new int[largo];
        largo=ingresarLargo(); 
        a=llenarArray(largo);
        imprimeArray(a);
        a=borraPosicion(a);
        imprimeArray(a);
    }
    static int ingresarLargo(){
        int j;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el largo del array: ");
        j=entrada.nextInt();
        return(j);
    }
    static int[] llenarArray(int x){
        int e; 
        int[] array=new int[x];
        for (e=0; e<array.length; e++){
            array[e]=(int)(Math.random()*10);
        }
        return (array);
    }
    static int[] borraPosicion (int[] a){
        int i, borra;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Ingrese la posicion a borrar: ");
            borra=entrada.nextInt();
        }while(borra<=0||borra>a.length);
        a[borra-1]=0;
        return(a);    
    }
    static void imprimeArray(int[] a){
        int i;
        for(i=0; i<a.length; i++)
        System.out.println("El valor "+(i+1)+" del array es: "+a[i]);
    }
}