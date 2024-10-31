import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.urfu.MessageHandler;

/**
 * Класс для тестирования обработчика сообщений MessageHandler
 */
public class MessageHandlerTest {

    /**
     * Проверяет корректность возвращаемого обработчиком сообщения
     */
    @Test
    public void handlersMessageTest() {
        String message = "123456789";
        MessageHandler messageHandler = new MessageHandler();
        String handledMessage = messageHandler.handleMessage(message);

        Assertions.assertEquals("Ваше сообщение: '123456789'", handledMessage);
    }
}