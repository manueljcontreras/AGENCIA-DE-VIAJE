package AgenciaViaje;

import java.util.Scanner;

public class proyecto {

    public static class AgenciaViaje {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int persona1 = -1;
            int persona2 = -1;
            int persona3 = -1;
            int persona4 = -1;
            int persona5 = -1;

            System.out.print("Introduce el numero de personas para este grupo (máximo 5): ");
            int cantidadPersonas = sc.nextInt();

            int media = cantidadPersonas;
            int respuesta = 0;
            int guardarGastos = 0;
            float repartoGastos = 0;

            boolean paso1 = false;
            boolean paso2 = false;

            do {
                System.out.println();
                System.out.println("       _-MENU DE GASTOS-_    ");
                System.out.println("1.Introducir gastos..........");
                System.out.println("2.Calcular reparto de gastos.");
                System.out.println("3.Mostrar reparto de gastos..");
                System.out.println("4.Salir......................");
                respuesta = sc.nextInt();

                if (respuesta == 1) {
                    for (int i = 1; i <= cantidadPersonas; i++) {
                        System.out.println("Introduce los gastos de la persona: " + i + " (o -1 si no viaja):");
                        int gastos = sc.nextInt();

                        if (gastos != -1) {
                            guardarGastos += gastos;

                            if (i == 1) {
                                if (persona1 == -1) persona1 = 0;
                                persona1 += gastos;
                            } else if (i == 2) {
                                if (persona2 == -1) persona2 = 0;
                                persona2 += gastos;
                            } else if (i == 3) {
                                if (persona3 == -1) persona3 = 0;
                                persona3 += gastos;
                            } else if (i == 4) {
                                if (persona4 == -1) persona4 = 0;
                                persona4 += gastos;
                            } else if (i == 5) {
                                if (persona5 == -1) persona5 = 0;
                                persona5 += gastos;
                            }
                        } else {
                            media--;
                        }
                    }
                    paso1 = true;
                }

                if (respuesta == 2) {
                    if (paso1) {
                        if (media > 0) {
                            repartoGastos = (float) guardarGastos / media;
                            System.out.println("El calculo de los gastos está listo. La media es: " + repartoGastos + " euros.");
                            paso2 = true;
                        } else {
                            System.out.println("No hay personas válidas para repartir.");
                        }
                    } else {
                        System.out.println("Error: Primero tienes que introducir los gastos en la opción 1.");
                    }
                }

                if (respuesta == 3) {
                    if (paso1 && paso2) {
                        for (int reparto = 1; reparto <= cantidadPersonas; reparto++) {

                            if (reparto == 1 && persona1 != -1) {
                                float balance = repartoGastos - persona1;
                                if (balance > 0) {
                                    System.out.println("La persona " + reparto + " pagará: " + balance + " euros.");
                                } else if (balance < 0) {
                                    System.out.println("La persona " + reparto + " debe recibir: " + Math.abs(balance) + " euros.");
                                } else {
                                    System.out.println("La persona " + reparto + " está en paz");
                                }
                            }
                            else if (reparto == 2 && persona2 != -1) {
                                float balance = repartoGastos - persona2;
                                if (balance > 0) {
                                    System.out.println("La persona " + reparto + " pagará: " + balance + " euros.");
                                } else if (balance < 0) {
                                    System.out.println("La persona " + reparto + " debe recibir: " + Math.abs(balance) + " euros.");
                                } else {
                                    System.out.println("La persona " + reparto + " está en paz");
                                }
                            }
                            else if (reparto == 3 && persona3 != -1) {
                                float balance = repartoGastos - persona3;
                                if (balance > 0) {
                                    System.out.println("La persona " + reparto + " pagará: " + balance + " euros.");
                                } else if (balance < 0) {
                                    System.out.println("La persona " + reparto + " debe recibir: " + Math.abs(balance) + " euros.");
                                } else {
                                    System.out.println("La persona " + reparto + " está en paz");
                                }
                            }
                            else if (reparto == 4 && persona4 != -1) {
                                float balance = repartoGastos - persona4;
                                if (balance > 0) {
                                    System.out.println("La persona " + reparto + " pagará: " + balance + " euros.");
                                } else if (balance < 0) {
                                    System.out.println("La persona " + reparto + " debe recibir: " + Math.abs(balance) + " euros.");
                                } else {
                                    System.out.println("La persona " + reparto + " está en paz");
                                }
                            }
                            else if (reparto == 5 && persona5 != -1) {
                                float balance = repartoGastos - persona5;
                                if (balance > 0) {
                                    System.out.println("La persona " + reparto + " pagará: " + balance + " euros.");
                                } else if (balance < 0) {
                                    System.out.println("La persona " + reparto + " debe recibir: " + Math.abs(balance) + " euros.");
                                } else {
                                    System.out.println("La persona " + reparto + " está en paz");
                                }
                            }
                        }
                    } else {
                        System.out.println("Error: Primero realiza la opción 1 y 2.");
                    }
                }
            } while (respuesta != 4);
        }
    }
}
