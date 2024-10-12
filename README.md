# Conversor de Moneda

Esta aplicación en Java permite a los usuarios convertir montos entre diferentes monedas utilizando la API Exchange Rate. El usuario puede seleccionar entre varias opciones de conversión y la aplicación se conectará a la API para obtener la tasa de cambio actual y realizar la conversión.

## Características

- Convierte montos entre las siguientes monedas:
  - Dólar a Peso Argentino
  - Peso Argentino a Dólar
  - Dólar a Real Brasileño
  - Real Brasileño a Dólar
  - Dólar a Peso Colombiano
  - Peso Colombiano a Dólar
- Interfaz sencilla y fácil de usar en la consola.
- Integración con la API Exchange Rate para obtener las tasas de cambio actualizadas.

## Requisitos

- Java 11 o superior
- Conexión a Internet
- Dependencias:
  - `Gson` para el manejo de JSON
  - `HttpClient` para realizar solicitudes HTTP

## Instalación

1. Clonar este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/AdrianYRincon/Challenge-conversor-monedas.git
    ```
2. Navegar al directorio del proyecto:
    ```bash
    cd conversor-moneda
    ```
3. Asegurarse de que las dependencias necesarias estén disponibles y configuradas.

## Uso

1. Ejecutar el programa principal:
    ```bash
    java Challenge-conversor-monedas
    ```
2. Seleccionar una de las opciones del menú para realizar una conversión de moneda:
    - **1**: Dólar => Peso Argentino
    - **2**: Peso Argentino => Dólar
    - **3**: Dólar => Real Brasileño
    - **4**: Real Brasileño => Dólar
    - **5**: Dólar => Peso Colombiano
    - **6**: Peso Colombiano => Dólar
    - **7**: Salir
3. Ingresar el monto que desea convertir y el programa mostrará el resultado de la conversión.

