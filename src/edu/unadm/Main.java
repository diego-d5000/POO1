package edu.unadm;

import java.util.Scanner;

public class Main {
    // Se crea una constante con el tamaño especifico del arreglo
    static final int ARRAY_LENGHT = 10;
    static final int BI_ARRAY_LENGHT = 4;

    public static void main(String[] args) {

        // Se crea el arreglo de tipo entero con el tamaño predefinido
        int[] myArr = new int[ARRAY_LENGHT];
        // Se crea un array bidimensional con el mismo tamaño (matriz)
        int[][] myArrBi = new int[BI_ARRAY_LENGHT][BI_ARRAY_LENGHT];
        // Se ejecuta la funcion definida debajo para capturar los datos del arreglo
        fillArrayFromKeyboard(myArr);
        fillBiArrayFromKeyboard(myArrBi);

        // Se imprimen los elementos que se capturaron
        System.out.println("\nElementos del arreglo Unidimensional:");
        for (int element : myArr){
            System.out.print(String.valueOf(element + " "));
        }

        System.out.println("\nElementos del arreglo Bidimensional (matriz):");
        for (int[] subArr : myArrBi){
            for (int element : subArr){
                System.out.print(String.valueOf(element + " | "));
            }
            System.out.print(String.valueOf("\n--------------\n"));
        }

        // Se guarda la suma de los elementos del arreglo, con la funcion sum definida debajo
        int sum = sum(myArr);
        int sumBi = sumBi(myArrBi);

        // Se imprime la suma y el promedio dividiendo la suma entre el tamaño del arreglo
        System.out.println("\nSuma arreglo unidimensional: " + String.valueOf(sum));
        System.out.println("Promedio arreglo unidimensional: " + String.valueOf(((double)sum / myArr.length)));

        System.out.println("\nSuma arreglo bidimensional: " + String.valueOf(sumBi));
        System.out.println("Promedio arreglo bidimensional: " + String.valueOf(((double)sumBi / (Math.pow(BI_ARRAY_LENGHT, 2)))));

        System.out.println();

    }

    static int sum(int[] arr){
        // Se inicializa el contador en 0
        int sum = 0;
        // Se recorre el arreglo, se suma y asigna a la variable acumulador
        for (int element : arr){
            sum += element;
        }
        // regresa esta suma
        return sum;
    }

    static int sumBi(int[][] arr){
        // Se inicializa el contador en 0
        int sum = 0;
        // Se recorre el arreglo, se suma y asigna a la variable acumulador
        for (int[] subarr : arr){
            for (int element : subarr){
                sum += element;
            }
        }
        // regresa esta suma
        return sum;
    }

    static void fillArrayFromKeyboard(int [] arr){
        // Se instancia la clase Scanner para obtener datos de la entrada del usuario (teclado)
        Scanner scanner = new Scanner(System.in);
        // Se recorre el arreglo
        for (int i = 0; i < arr.length; i++){
            System.out.format("Valor del elemento %d: ", i + 1);
            // Se obtiene el entero que inserto el usuario y se asigna a la posicion en curso del arreglo
            arr[i] = scanner.nextInt();
        }
    }

    static void fillBiArrayFromKeyboard(int [][] arr){
        // Se instancia la clase Scanner para obtener datos de la entrada del usuario (teclado)
        Scanner scanner = new Scanner(System.in);
        // Se recorre el arreglo
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.format("Valor del elemento %d, %d: ", i + 1, j+1);
                // Se obtiene el entero que inserto el usuario y se asigna a la posicion en curso del arreglo
                arr[i][j] = scanner.nextInt();
            }
        }
    }

}
