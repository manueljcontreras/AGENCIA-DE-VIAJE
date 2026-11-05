package org.example.AgenciaDeViajes;

import java.util.Scanner;

public class Amedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int persona1 = 0;
        int persona2 = 0;
        int persona3 = 0;
        int persona4 = 0;
        int persona5 = 0;


        System.out.print("Introduce el numero de personas para este grupo: ");
        int cantidadPersonas = sc.nextInt();
        int media = 0;
        switch (cantidadPersonas){
            case 2:
                media = 2;
                break;
            case 3:
                media = 3;
                break;
            case 4:
                media = 4;
                break;
            case 5:
                media = 5;
                break;
            default:
                System.out.println("Cantidad de personas no válidas.");
                break;
        }

        int respuesta = 0;

        do {
            System.out.println();
            System.out.print("       _-MENU DE GASTOS-_    ");
            System.out.print("1.Introducir gastos..........");
            System.out.print("2.Calcular reparto de gastos.");
            System.out.print("3.Mostrar reparto de gastos..");
            System.out.print("4.Salir......................");
            respuesta = sc.nextInt();


        }while (respuesta != 4);

    }
}
