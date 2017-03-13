package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayInsTest {
    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        ArrayIns arrayIns = new ArrayIns(10);       //создание объекта массива, размером 10
        arrayIns.insert(5);                        // вставка элементов
        arrayIns.insert(7);
        assertEquals(5,arrayIns.getFirst());     // сравнение ожидаемого результата с возвращаемым значением

    }//end testInsert()

    /**
     * проверка вставки
     */
    @Test
    public void testInsertionSort() throws Exception{
        int maxSize = 10;                                       // максимальный размер массива
        ArrayIns arr;
        arr = new ArrayIns(maxSize);                            // создание нового массива размера maxSize
        for(int j=0; j<maxSize; j++){                           // вставка рандомныхэлемнтов в массив
            long n = (long)(java.lang.Math.random()*(maxSize-1));
            arr.insert(n);
        }
        arr.insertionSort();                                    // сортировка от меньшего к большему

        boolean b = false;
        try {
        for(int j=0; j<maxSize; j++){                            // вставка рандомныхэлемнтов в массив
            if(arr.getItem(j)<=arr.getItem(j+1))
                b = true;
                assertEquals(true,b);

        }
        }catch (Exception ex){}



    }//end testInsertionSort()



}//end class ArrayInsTest