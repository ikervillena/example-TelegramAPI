import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChat;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class CharacterCountBot extends TelegramLongPollingBot {

    //
    private String username = "USERNAME";
    private String token = "TOKEN";

    @Override
    public void onUpdateReceived(Update update) {
        // Obtener el mensaje recibido
        String message = update.getMessage().getText();
        Long chatId = update.getMessage().getChatId();
        System.out.println("Mensaje recibido: " + message);

        // Variable para obtener la respuesta del bot
        String respuesta = "";

        // Verificar si el mensaje es "/start"
        if(message.equals("/start")) {
            // Si el mensaje es "/start", enviar un mensaje de bienvenida
            respuesta = "Bienvenido al Bot de Contador de Caracteres!\n" +
                    "Este bot cuenta el numero de caracteres en tus mensajes.\n\n" +
                    "Enviame un mensaje y te dire cuantos caracteres tiene!";
        } else {
            // Si el mensaje no es "/start", contestar indicando el número de caracteres del mensaje
            int length = message.length();
            respuesta = "Tu mensaje tiene " + length + " caracteres";
        }
        try {
            // Enviar la respuesta
            execute(new SendMessage(chatId.toString(),respuesta));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdatesReceived(List<Update> updates) {
        super.onUpdatesReceived(updates);
    }

    @Override
    public String getBotUsername() {
        // Devolver el nombre de usuario del bot
        return username;
    }

    @Override
    public String getBotToken() {
        // Devolver el token de acceso del bot
        return token;
    }

    @Override
    public void onRegister() {
        super.onRegister();
    }

}