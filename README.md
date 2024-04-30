<h1>Transcriptor de Monedas en Tiempo Real</h1>
Este programa es una aplicación de consola que permite convertir monedas en tiempo real utilizando el servicio de ExchangeRate-API. La aplicación solicita al usuario los datos de entrada utilizando la clase Scanner de Java. Luego, realiza solicitudes HTTP al servicio de ExchangeRate-API para obtener las tasas de cambio más recientes entre las diferentes monedas.

<h3>Funcionalidades</h3>
<p><b>Solicitud de Datos de Entrada:</b> Utilizando la clase Scanner, la aplicación solicita al usuario la moneda de origen, la moneda de destino y la cantidad de dinero que desea convertir.
<b>Consulta HTTP:</b> La aplicación realiza solicitudes HTTP al servicio de ExchangeRate-API utilizando el método consultar(String direccion) para obtener las tasas de cambio actualizadas.
<b>Mapeo de JSON a Objetos Java:</b>b Una vez que se recibe la respuesta JSON del servicio de ExchangeRate-API, la aplicación utiliza la biblioteca Gson para mapear el JSON a objetos Java, lo que permite trabajar con los datos de manera más estructurada.
<b>Actualización en Tiempo Real:</b>b Gracias al servicio de ExchangeRate-API, que actualiza sus divisas diariamente, la aplicación proporciona tasas de cambio actualizadas en tiempo real.</p>
<h3>Dependencias<h3>
<p>La aplicación utiliza las siguientes dependencias

<b>Gson:<b> Biblioteca de Google para serialización y deserialización de objetos JSON.</p>
<i>Ejemplo de Uso</i>

<p>Ingrese la moneda que quiere convertir: USD<br>
Ingrese la moneda destino: EUR<br>
Ingrese el monto: 100<br>
Usted depositó: 100.0 USD<br>
y a cambio retiró: 85.74 EUR<p>
<h3>Contribuciones</h3>
<p>¡Las contribuciones son bienvenidas! Si deseas contribuir al proyecto, por favor abre un pull request con tus cambios propuestos.</p>
