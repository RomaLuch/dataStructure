package chapter3;

import java.util.Arrays;

class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;// Размер массива
        ArrayIns arr;// Ссылка на массив
        arr = new ArrayIns(maxSize); // Создание массива
        arr.insert(77);// Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display(); // Вывод элементов
        arr.insertionSort(); // Сортировка методом вставки
        arr.display();

        ArrayIns arr1;// Ссылка на массив
        arr1 = new ArrayIns(maxSize); // Создание массива
        arr1.insert(4);
        arr1.insert(1);
        arr1.insert(2);
        arr1.insert(3);
        arr1.insert(6);
        arr1.insert(5);

        System.out.println(arr1.median());


        ArrayIns arr2;// Ссылка на массив
        arr2 = new ArrayIns(maxSize); // Создание массива
        arr2.insert(1);
        arr2.insert(1);
        arr2.insert(2);
        arr2.insert(1);
        arr2.insert(5);
        arr2.insert(5);
        arr2.insert(0);
        arr2.insert(0);

        arr2.noDubs();

        arr2.display();
    } // Повторный вывод
}
////////////////////////////////////////////////////////////////