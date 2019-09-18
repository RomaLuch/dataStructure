// highArray.java
// Класс массива с высокоуровневым интерфейсом
// Запуск программы: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray {
    private long[] a;    // Ссылка на массив a
    private int nElems;    // Количество элементов в массиве

    //-----------------------------------------------------------
    public HighArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }
//-----------------------------------------------------------Интерфейсы классов

    public boolean find(long searchKey) {
// Поиск заданного значения
        int j;
        for (j = 0; j < nElems; j++) // Для каждого элемента
            if (a[j] == searchKey)// Значение найдено?
                break;  // Да - выход из цикла
        return j != nElems;
    }

    //-----------------------------------------------------------
    public void insert(long value)// Вставка элемента в массив
    {
        a[nElems] = value;// Собственно вставка
        nElems++;// Увеличение размера
    }

    //-----------------------------------------------------------
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)// Поиск заданного значения
            if (value == a[j])
                break;
        if (j == nElems)// Найти не удалось
            return false;
        else// Значение найдено
        {
            for (int k = j; k < nElems; k++) // Сдвиг последующих элементов
                a[k] = a[k + 1];
            nElems--;// Уменьшение размера
            return true;
        }
    }

    public long getMax() {
        if (nElems == 0) {
            return -1;
        }
        long max = 0;

        for (int i = 0; i < nElems; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public long removeMax() {
        if (nElems == 0) {
            return -1;
        }
        long max = 0;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        delete(max);
        return max;
    }

    //-----------------------------------------------------------
    public void display()// Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++)// Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }

    public void noDubs() {
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = i + 1; j < nElems; j++) {
                if (a[i] == a[j]) {
                    delete(a[j]);
                }
            }
        }
    }
//-----------------------------------------------------------
} // Конец класса HighArray
////////////////////////////////////////////////////////////////