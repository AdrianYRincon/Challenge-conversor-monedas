package principal;

import helpers.Menu;

import java.util.Scanner;

public class ConversorDeMonedas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Menu menu = new Menu();
        boolean salir = false;

        while (true){

            System.out.println("*********************************");
            System.out.println("Sea bienvenido/aal Conversor de Moneda=");
            System.out.println();
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileño");
            System.out.println("4) Real Brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("*********************************");
            int opcion =  Integer.valueOf(entrada.nextLine());
            salir = menu.resultado(opcion);
            if (salir) return;

        }


    }
}
