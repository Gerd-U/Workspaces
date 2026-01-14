import java.util.Scanner;

public class Mainn {

    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in)

        //Mayor
        int mayor = numbers[0];

        for(int i = 0; i <= numbers.length - 1; i++){
            if (numbers[i] > mayor) {
            mayor = numbers[i];
            }
    
        }

        //Menor
        int menor = numbers[0];

        for(int i = 0; i <= numbers.length - 1; i++){
            if (numbers[i] < menor) {
            menor = numbers[i];
            }
    
        }

        //suma de todos los elementos
        int suma = 0;

        for(int i = 0; i <= numbers.length - 1; i++){
            suma += numbers[i];
    
        }
        
        //Segundo mayor


        //Promedio


        //Impar - par


        //Esta o no?


        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("La suma de todos los elementos es: " + suma);
    }

}


