    package org.example;

    import com.google.gson.*;
    import static org.example.InterfazGrafica.*;;
    import static org.example.ConsultaApi.*;
    import java.io.IOException;


    public class Main {

        public static void main(String[] args) throws IOException, InterruptedException {

            //Generando una instancia de Gson con las preconfiguraciones ya establecidas
            //Gson gson = generarGson();

            //El metodo solicitarEntradas devuelve un string con los parametros de la URL ya insertados
            String direccion = solicitarEntradas();

            //El metodo consultar consume la URL que hemos creado y devuelve un JSON con los datos solicitados
            String json = consultar(direccion);

            //Crea un objeto  DivisaApi mapeando datos de la respuesta json a un formato "Objeto Java" de la clase especificada, usando la librería Gson
            DivisaApi miDivisaApi = new Gson().fromJson(json,DivisaApi.class);

            //Usando un constructor especialmente preparado creamos un objeto Divisa que es el que va a tener los atributos finales
            Divisa miDivisa = new Divisa(miDivisaApi);

            System.out.println("Usted depositó: " + InterfazGrafica.monto +" " +miDivisa.getBase_code() +"\n" +
                    "y a cambio retiró: " + miDivisa.getConversion_result() +" "+miDivisa.getTarget_code());

        }



    }