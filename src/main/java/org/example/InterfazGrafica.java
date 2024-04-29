package org.example;

import java.util.Scanner;

public class InterfazGrafica {

    static double monto;

    //Mostramos todas las monedas disponibles
    private static void mostrarMonedasDisponibles() {
        System.out.println("""
                    Bienvenido, estas son las monedas disponibles:
                    
                    ARS - Peso Argentino (Argentina)\t\t\t\t\tEUR - Euro (Unión Europea)\t\t\t\tNOK - Corona Noruega (Noruega)
                    AUD - Dólar Australiano (Australia)\t\t\t\t\tGBP - Libra Esterlina (Reino Unido)\t\tNZD - Dólar Neozelandés (Nueva Zelanda)
                    BOB - Boliviano (Bolivia)\t\t\t\t\t\t\tGTQ - Quetzal (Guatemala)\t\t\t\tPAB - Balboa (Panamá)
                    BRL - Real (Brasil)\t\t\t\t\t\t\t\t\tGYD - Dolar Guyanés (Guyana)\t\t\tPEN - Sol (Perú)
                    BZD - Dólar Belizeño (Belice)\t\t\t\t\t\tHKD - Dólar Hongkonés (Hong Kong)\t\tSEK - Corona Sueca (Suecia)
                    CAD - Dólar Canadiense (Canadá)\t\t\t\t\t\tHTG - Gourde (Haití)\t\t\t\t\tPYG - Guaraní (Paraguay)
                    CHF - Franco (Suiza)\t\t\t\t\t\t\t\tHNL - Lempira (Honduras)\t\t\t\tSGD - Dólar Singapurense (Singapur)
                    CLP - Peso Chilleno (Chile)\t\t\t\t\t\t\tJMD - Dólar Jamaiquino (Jamaica)\t\tSVC - Colón Salvadoreño (El Salvador)
                    COP - Peso Colombiano (Colombia)\t\t\t\t\tJPY - Yen (Japón)\t\t\t\t\t\tTTD - Dólar Trinitense (Trinidad y Tobago)
                    CRC - Colón Costarricense (Costa Rica)\t\t\t\tKRW - Won (Corea del Sur)\t\t\t\tUYU - Peso Uruguayo (Uruguay)
                    CUP - Peso Cubano (Cuba)\t\t\t\t\t\t\tKYD - Dólar Caimanense (Islas Caimán)\tUSD - Dólar Estadounidense (Estados Unidos)
                    CNY - Renminbi (China)\t\t\t\t\t\t\t\tMXN - Peso Mexicano (México)\t\t\tVES - Bolívar Soberano (Venezuela)
                    DOP - Peso Dominicano (República Dominicana)\t\tNIO - Córdoba (Nicaragua)\t\t\t\tZAR - Rand (Sudáfrica)                
                    """);
    }

    //Usamos clase Scanner para solicitar información de entrada
    public static String solicitarEntradas(){
        mostrarMonedasDisponibles();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la moneda que quiere convertir:");
        String monedaBase = entrada.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda destino:");
        String monedaDestino = entrada.nextLine().toUpperCase();
        System.out.println("Ingrese el monto:");
        monto = entrada.nextDouble();
        return "https://v6.exchangerate-api.com/v6/7011b0c9e6efadc280de2c19/pair/" + monedaBase + "/" + monedaDestino + "/" + monto;
    }
}
