package Main;

import java.util.Scanner;

public class EjercicioCuadrado {
    public static void main(String[] args) {
        int filas,columnas;

        Scanner sc =  new Scanner(System.in);

        System.out.println("Ingrese el numero de filas: ");
        filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        columnas = sc.nextInt();

        for(int i = 1; i <= filas; i++){
            for(int j = 1; j <= columnas; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
