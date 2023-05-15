# API de Telegram - Bot de Contador de Caracteres
Este proyecto es un ejemplo sencillo de cómo utilizar la API de Telegram para crear un bot de Contador de Caracteres. El bot cuenta el número de caracteres en los mensajes enviados por los usuarios y responde con la cantidad de caracteres.

## Instrucciones de uso
1. Obtener un token de acceso para el bot en Telegram.
    1. Iniciar sesión en [Telegram](https://web.telegram.org/) y buscar _BotFather_.
    2. Iniciar una conversación con el BotFather y seguir las instrucciones para crear un nuevo bot y obtener el token de acceso.
2. Agregar el username y el token en la clase CharacterCountBot.java.
3. Ejecutar la aplicación por medio del comando _*ant run*_.
4. Interactuar con el bot en Telegram.
    1. Buscar el nombre de usuario del bot en Telegram.
    2. Enviar mensaje al bot.
    3. Se recibirá una respuesta con la cantidad de caracteres en el mensaje.

## Librerías utilizadas
El proyecto utiliza las siguientes bibliotecas:
* _*org.telegram.telegrambots:telegrambots:5.3.0*_: Proporciona las clases y métodos necesarios para interactuar con la API de Telegram en Java.

## Detalles adicionales
* El bot responde automáticamente a los comandos y mensajes que recibe.
* Se incluye un archivo build.xml que facilita la compilación y ejecución del programa utilizando Apache Ant.