package ru.geekbrains.lesson4jс.task2;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем справочник");
        Spravochnik spravochnik = new Spravochnik();
        System.out.println("-----------------");

        System.out.println("Заполняем справочник");
        spravochnik.add("Иванов А.П.", "4234234234");
        spravochnik.add("Иванов А.П.", "1234567");
        spravochnik.add("Петров Д.И.", "2345678");
        spravochnik.add("Сидоров Г.У.", "3456789");
        spravochnik.add("Иванов А.П.", "4567890");
        System.out.println(" ");

        System.out.println("Получаем номера");
        System.out.println("Иванов А.П.");
        System.out.println(spravochnik.get("Иванов А.П."));
        System.out.println("Петров Д.И.");
        System.out.println(spravochnik.get("Петров Д.И."));
        System.out.println("Сидоров Г.У.");
        System.out.println(spravochnik.get("Сидоров Г.У."));
        System.out.println(" ");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов В.А.");
        System.out.println(spravochnik.get("Кузнецов В.А."));
        System.out.println(" ");

        System.out.println("Записыаем существующий номер");
        spravochnik.add("Иванов А.П.", "4234234234");
        System.out.println("Иванов А.П.");
        System.out.println(spravochnik.get("Иванов А.П."));
    }
}
