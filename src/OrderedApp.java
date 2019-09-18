import java.util.Arrays;

class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;// Размер массива
        OrdArray arr;// Ссылка на массив
        arr = new OrdArray(maxSize);// Создание массива
        OrdArray arr1 = new OrdArray(maxSize);// Создание массива
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);// Вставка 10 элементов
        int searchKey = 55;// Поиск элемента
        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.display(); // Вывод содержимого
        arr.delete(00);
        arr.delete(55);
        arr.delete(99); // Удаление трех элементов
        arr.display();// Повторный вывод

        arr1.insert(77);
        arr1.insert(99);
        arr1.insert(44);
        arr1.insert(55);
        arr1.insert(22);
        arr1.insert(88);
        arr1.insert(11);
        arr1.insert(00);
        arr1.insert(66);
        arr1.insert(33);
        System.out.println("+++++++++++++++++++++++++");
        arr1.display();// Повторный вывод

        long[] first = new long[]{1, 3, 4};
        long[] second = new long[]{2, 5, 6};

        long[] third = new long[]{1, 3, 4, 7,8};
        long[] forth = new long[]{2, 5, 6};

        System.out.println(Arrays.toString(OrdArray.merge(second, first)));
        System.out.println(Arrays.toString(OrdArray.merge(first, second)));
        System.out.println(Arrays.toString(OrdArray.merge(third, forth)));
        System.out.println(Arrays.toString(OrdArray.merge(forth, third)));

    }
}