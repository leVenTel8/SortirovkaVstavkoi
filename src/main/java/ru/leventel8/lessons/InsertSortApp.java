package ru.leventel8.lessons;

class InsertSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;              // максимальный размер массива
        ArrayIns arr;
        arr = new ArrayIns(maxSize);    // создание нового массива размера maxSize

        arr.insert(77);            // заполнение массива
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                  // вывод содержимого

        arr.insertionSort();            // сортировка вставкой

        arr.display();                  // вывод содержимого массива
    }
}
