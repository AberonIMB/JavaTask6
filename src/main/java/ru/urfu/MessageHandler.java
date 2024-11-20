package ru.urfu;

/**
 * Обрабатывает сообщения пользователя
 */
public class MessageHandler {
    /**
     * Возвращает сообщение пользователя с подписью "Ваше сообщение: " в начале
     * @param message текст сообщения пользователя
     * @return сообщение пользователя с подписью "Ваше сообщение: " в начале
     */
    public String handleMessage(String message) {
        return String.format("Ваше сообщение: '%s'", message);
    }
}