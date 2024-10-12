package helpers;

import conexionApi.ConexionApi;
import modelos.Exchange;

import java.util.Scanner;

public class Menu {

    public boolean resultado(int opcion){

        ConexionApi conexionApi = new ConexionApi();
        Exchange exchange;
        double amount;
        Scanner entrada = new Scanner(System.in);


        switch (opcion){

            case 1:
                System.out.println("Ingrese el valor que desea convertir: ");
                amount = Double.valueOf(entrada.nextLine());
                exchange = conexionApi.conexion("USD","ARS",amount);
                System.out.println("El valor "+amount+" ["+exchange.base_code()+"]"+
                        " corresponde al valor final de =>>> "+
                        exchange.conversion_result()+" ["+exchange.target_code()+"]");

                break;
            case 2:
                System.out.println("Ingrese el valor que desea convertir: ");
                amount = Double.valueOf(entrada.nextLine());
                exchange = conexionApi.conexion("ARS", "USD", amount);
                System.out.println("El valor " + amount + " [" + exchange.base_code() + "]" +
                        " corresponde al valor final de =>>> " +
                        exchange.conversion_result() + " [" + exchange.target_code() + "]");
                break;

            case 3:
                System.out.println("Ingrese el valor que desea convertir: ");
                amount = Double.valueOf(entrada.nextLine());
                exchange = conexionApi.conexion("USD", "BRL", amount);
                System.out.println("El valor " + amount + " [" + exchange.base_code() + "]" +
                        " corresponde al valor final de =>>> " +
                        exchange.conversion_result() + " [" + exchange.target_code() + "]");
                break;

            case 4:
                System.out.println("Ingrese el valor que desea convertir: ");
                amount = Double.valueOf(entrada.nextLine());
                exchange = conexionApi.conexion("BRL", "USD", amount);
                System.out.println("El valor " + amount + " [" + exchange.base_code() + "]" +
                        " corresponde al valor final de =>>> " +
                        exchange.conversion_result() + " [" + exchange.target_code() + "]");
                break;

            case 5:
                System.out.println("Ingrese el valor que desea convertir: ");
                amount = Double.valueOf(entrada.nextLine());
                exchange = conexionApi.conexion("USD", "COP", amount);
                System.out.println("El valor " + amount + " [" + exchange.base_code() + "]" +
                        " corresponde al valor final de =>>> " +
                        exchange.conversion_result() + " [" + exchange.target_code() + "]");
                break;

            case 6:
                System.out.println("Ingrese el valor que desea convertir: ");
                amount = Double.valueOf(entrada.nextLine());
                exchange = conexionApi.conexion("COP", "USD", amount);
                System.out.println("El valor " + amount + " [" + exchange.base_code() + "]" +
                        " corresponde al valor final de =>>> " +
                        exchange.conversion_result() + " [" + exchange.target_code() + "]");
                break;

            case 7:
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                return true;

            default:
                System.out.println("Opción invalida");
                return true;

        }

        return false;
    }
}
