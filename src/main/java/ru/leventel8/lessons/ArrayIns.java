package ru.leventel8.lessons;

class ArrayIns
{
    private long[] a;                       //Переменная приватного типа, объявление массива
    private int nElems;                     //Переменная приватного типа, объявление счетчика элементов массива

    /**
     * Конструктор при инициализации
     * принимает параметр max
     * @param max
     *      размер массива
     */
    public ArrayIns(int max)
    {
        a = new long[max];                  // создание нового объекта массива, размера max
        nElems = 0;                         // счетчик вставленных элементов
    }

    /**
     * вставка в массив
     * @param value
     */
    public void insert(long value)
        {
        a[nElems] = value;                  // вставка value в ячейку nElems
        nElems++;                           // имнкримент nElems
    }// end insert()


    /**
     * вывод содержимого массива
     */
    public void display()
    {
        for(int j=0; j<nElems; j++)          // перебор элементов массива в цикле
            System.out.print(a[j] + " ");    // вывод содержимого массива
        System.out.println("");
    }// end display()

    /**
     * сортировка вставкой
     */
    public void insertionSort()
    {
        int in, out;

        for(out=1; out<nElems; out++)
        {
            long temp = a[out];             // temp переменная
            in = out;
            while(in>0 && a[in-1] >= temp)  // сравнение in и in-1, если true && true выполнение тела цикла
            {
                a[in] = a[in-1];            // перестановка большегос меньшим
                --in;
            }
            a[in] = temp;                   // вставка временной переменной
        }
    }// end insertionSort()

    /**
     * тестовый метод, для проверки сортировки и вставки в массив
     */
    public long getFirst(){
        long first = a[0];
        return first;

    }
}// end class ArrayIns
