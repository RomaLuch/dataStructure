package chapter2;

public class Main {

    public static void main(String[] args) {

        int maxSize = 100;
// Размер массива
        HighArray arr;
// Ссылка на массив
        arr = new HighArray(maxSize); // Создание массива
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33); // Вставка 10 элементов
        arr.display(); // Вывод элементов
        int searchKey = 88;
// Поиск элемента
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
// Удаление трех элементов
        arr.display();
// Повторный вывод
    }
}
