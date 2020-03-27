package ru.progwards.java1.lessons.interfaces;
import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.testlesson.ProgwardsTelegramBot;

public class ShopBot extends ProgwardsTelegramBot {

    private final String menu = "У нас есть кроссовки, туфли и сапоги.";

    @Override
    public String processMessage(String text) {
        checkTags(text);
        if (foundCount() == 1) {
            if (checkLastFound("привет"))
                return "Приветствую тебя, о мой повелитель!\n Что желаешь? " + menu;
            if (checkLastFound("конец"))
                return "Спасибо за заказ.";
            if (checkLastFound("дурак"))
                return "Не надо ругаться. Я не волшебник, я только учусь";
            return "Отлично, добавляю в заказ " + getLastFound() + " Желаешь что-то еще?";
        }

            if (foundCount() > 1)
                return "Под твой запрос подходит: \n" + extract() + "Выбери что-то одно, и я добавлю это в заказ.";
            return "Я не понял, возможно у нас этого нет, попробуй сказать по другому. " + menu;
    }

    public static void main(String[] args) {
        System.out.println("Hello bot!");

        ApiContextInitializer.init();

        ShopBot bot = new ShopBot();
        bot.username = "ShopBot74bot";
        bot.token = "1014994194:AAFw2xYP-knzzoE9OFV9nl2M4UXWLaBA__c";

        bot.addTags("привет", "привет, здрасьте, здравствуй, добр, день, вечер, утро, hi, hello");
        bot.addTags("конец", "конец, все, стоп, нет");
        bot.addTags("дурак", "дурак, придурок, идиот, тупой");

        bot.addTags("Кроссовки для бега", "кросс, марофон, атлет, улиц");
        bot.addTags("Кроссовки для зала", "баскетбол, волейбол, регби");
        bot.addTags("Кроссовки для йоги", "йога, пилатесс, воздушн, гимнаст");

        bot.addTags("Туфли женские", "макасин, , слипер, лодочк");
        bot.addTags("Туфли мужские", "оксфорд, лофер, монк");


        bot.addTags("Сапоги женские", "кожа, замш, заменит, высок, каблук");
        bot.addTags("Сапоги мужские", "кожа, замш, заменит");

        bot.start();
    }

}
