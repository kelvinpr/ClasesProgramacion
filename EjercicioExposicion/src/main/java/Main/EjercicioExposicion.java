package Main;

import java.util.Scanner;

public class EjercicioExposicion {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura del triangulo: ");
        altura = sc.nextInt();
        sc.close();

        for(int i  = 1; i <= altura; i++){
            for(int j = 1;j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i  = 1; i <= altura; i++){
            for(int j = 1;j <= altura - i; j++ ){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = altura; i >= 1; i--){
            for(int j = 1;j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = altura; i >= 1; i--){
            for(int j = 1;j <= altura - i; j++ ){
                System.out.print(" ");
            }
            for(int j = 1;j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
