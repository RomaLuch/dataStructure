class OrdArray {
    private long[] a;    // Ссылка на массив a
    private int nElems;     // Количество элементов данных

    //-----------------------------------------------------------
    public OrdArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0;
    }

    //-----------------------------------------------------------
    public int size() {
        return nElems;
    }

    //-----------------------------------------------------------
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;// Элемент найден
            else if (lowerBound > upperBound)
                return nElems;// Элемент не найден
            else// Деление диапазона
            {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
    }

    //-----------------------------------------------------------
    public void insert(long value)// Вставка элемента в массив
    {
        int j;
        for (j = 0; j < nElems; j++)// Определение позиции вставки
            if (a[j] > value)// (линейный поиск)
                break;
        for (int k = nElems; k > j; k--)// Перемещение последующих элементов
            a[k] = a[k - 1];
        a[j] = value;// Вставка
        nElems++;// Увеличение размера
    }

    public void binaryInsert(long value)// Вставка элемента в массив
    {
        int curIn = 0;
        int lowerBound = 0;
        int upperBound = nElems - 1;

        while (upperBound != lowerBound) {
            curIn = (lowerBound + upperBound) / 2;
            if (value > a[curIn]) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
        }

        for (int k = nElems; k > curIn; k--)// Перемещение последующих элементов
            a[k] = a[k - 1];
        a[curIn] = value;// Вставка
        nElems++;// Увеличение размера
    }

    //-----------------------------------------------------------
    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems)// Найти не удалось
            return false;
        else// Элемент найден
        {
            for (int k = j; k < nElems; k++) // Перемещение последующих элементов
                a[k] = a[k + 1];
            nElems--;// Уменьшение размераРеализация упорядоченного массива на языке Java
            return true;
        }
    }

    public static long[] merge(long[] arr1, long[] arr2) {
        if (arr1.length == 0) return arr2;
        if (arr2.length == 0) return arr1;

        long[] result = new long[arr1.length + arr2.length];
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[i + j] = arr1[i++];
            } else {
                result[i + j] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[i + j] = arr1[i++];
        }

        while (j < arr2.length) {
            result[i + j] = arr2[j++];
        }

        return result;
    }

    //-----------------------------------------------------------
    public void display()// Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++)// Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println("");
    }
//-----------------------------------------------------------
}
