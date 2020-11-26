package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl1 = "Это ставит меня в тупик. Задайте другой вопрос.";
        String rsl2 = "Привет, умник.";
        String rsl3 = "До скорой встречи.";
        String rsl;
        if (question.equals("Привет, Бот.")) {
            rsl = rsl2;
        } else if (question.equals("Пока.")) {
            rsl = rsl3;
        } else {
            rsl = rsl1;
        }
        return rsl;
    }
    
    public static void main(String[] args) {
        String ans1 = DummyBot.answer("Привет, Бот.");
        System.out.println(ans1);
        String ans2 = DummyBot.answer("Как дела???");
        System.out.println(ans2);
        String ans3 = DummyBot.answer("Пока.");
        System.out.println(ans3);
    }
}