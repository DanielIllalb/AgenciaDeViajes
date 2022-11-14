import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float gastoviajero=0,viajero1=0,viajero2=0,viajero3=0,viajero4=0,viajero5=0,media;
        int numViajero = 0;
        boolean v1=false,v2=false,v3=false,v4=false,v5=false;




        boolean salir = false;
        do {

        System.out.println("Elige una opción: ");

        System.out.println("============================================");
        System.out.println("1.Introducir gastos de los viajeros");
        System.out.println("2.Calcular reparto de gastos");
        System.out.println("3.Mostrar el reparto entre los viajeros");
        System.out.println("4.Salir");
        System.out.println("=============================================");
        int opc = s.nextInt();


            switch (opc) {
                //caso 1
                case 1:

                    for (int i = 1; i <= 5; i++) {


                        switch (i) {
                            case 1 -> {
                                System.out.println("Dime el gasto del viajero 1");
                                viajero1 = s.nextFloat();
                                if (viajero1 < 0) {

                                    viajero1 = 0;
                                } else
                                    numViajero++;
                                v1 = true;
                            }
                            case 2 -> {
                                System.out.println("Dime el gasto del viajero 2");
                                viajero2 = s.nextFloat();
                                if (viajero2 < 0) {

                                    viajero2 = 0;
                                } else {

                                    numViajero++;
                                    v2 = true;

                                }
                            }
                            case 3 -> {
                                System.out.println("Dime el gasto del viajero 3");
                                viajero3 = s.nextFloat();
                                if (viajero3 < 0) {

                                    viajero3 = 0;

                                } else {
                                    numViajero++;
                                    v3 = true;
                                }
                            }
                            case 4 -> {
                                System.out.println("Dime el gasto del viajero 4");
                                viajero4 = s.nextFloat();
                                if (viajero4 < 0) {


                                    viajero4 = 0;

                                } else {


                                    numViajero++;
                                    v4 = true;

                                }
                            }
                            case 5 -> {
                                System.out.println("Dime el gasto del viajero 5");
                                viajero5 = s.nextFloat();
                                if (viajero5 < 0) {

                                    viajero5 = 0;

                                } else {
                                    numViajero++;
                                    v5 = true;

                                }
                            }
                        }







                    }

                //caso 2
                case 2:
                    gastoviajero+= viajero1 + viajero2 + viajero3 + viajero4+ viajero5;
                   media=gastoviajero/numViajero;

                   if (v1){

                       if (viajero1<media){

                           System.out.println("El viajero debe de pagar");
                           viajero1=media-viajero1;

                       }else{
                           System.out.println("Al viajero le debe de devolver");
                           viajero1=viajero1-media;

                       }


                   }

                    if (v2){

                        if (viajero2<media){

                            System.out.println("El viajero debe de pagar");
                            viajero2=media-viajero2;

                        }else{

                            System.out.println("Al viajero le debe de devolver");
                            viajero2=viajero2-media;
                        }


                    }

                    if (v3){

                        if (viajero3<media){

                            System.out.println("El viajero debe de pagar");
                            viajero3=media-viajero3;

                        }else{
                            System.out.println("Al viajero le debe de devolver");
                            viajero3=viajero3-media;


                        }
                    }

                    if (v4){

                        if (viajero4<media){

                            System.out.println("El viajero debe de pagar");
                            viajero4=media-viajero4;

                        }else{
                            System.out.println("Al viajero le debe de devolver");
                            viajero4=viajero4-media;
                        }


                    }

                    if (v5){

                        if (viajero5<gastoviajero){
                            System.out.println("El viajero debe de pagar");
                            viajero5=media-viajero5;

                        }else{
                            System.out.println("Al viajero le debe de devolver");
                            viajero5=viajero5-media;

                        }


                    }





                    break;


                    //caso3
                case 3:


                    if (v1) {
                        System.out.printf("El viajero debe pagar " + viajero1);
                    }

                    if (v1) {
                        System.out.printf("El viajero debe pagar " + viajero2);
                    }

                    if (v1) {
                        System.out.printf("El viajero debe pagar " + viajero3);
                    }

                    if (v1) {
                        System.out.printf("El viajero debe pagar " + viajero4);
                    }

                    if (v1) {
                        System.out.printf("El viajero debe pagar " + viajero5);
                    }




                    break;



                    //caso4 salida

                case 4:

                    System.out.println("Cerrando el programma");
                    salir = true;


            }

        }while (salir);

    }
}










